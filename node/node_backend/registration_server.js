/*
 *
 * Copyright 2015 gRPC authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

var PROTO_PATH1 = __dirname + '/../../java/src/main/proto/sendCode.proto';
var grpc = require('grpc');
var protoLoader = require('@grpc/proto-loader');
var packageDefinition1 = protoLoader.loadSync(
  PROTO_PATH1,
  {
    keepCase: true,
    longs: String,
    enums: String,
    defaults: true,
    oneofs: true
  });
var proto1 = grpc.loadPackageDefinition(packageDefinition1).helloworld;

var PROTO_PATH2 = __dirname + '/../../java/src/main/proto/registration.proto';
var packageDefinition2 = protoLoader.loadSync(
  PROTO_PATH2,
  {
    keepCase: true,
    longs: String,
    enums: String,
    defaults: true,
    oneofs: true
  });
var proto2 = grpc.loadPackageDefinition(packageDefinition2).helloworld;

var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/";

function newUser(call, callback) {

  //console.log(call.request);;
  var client = new proto1.SendCodeService('localhost:50050', grpc.credentials.createInsecure());

  client.generateCode({ email: call.request.email }, function (err, response) {
    console.log(response.code);
    callback(null, { message: 'The password is sent to ' + call.request.name });

    //Insert user in db
    MongoClient.connect(url, function (err, db) {
      if (err) throw err;
      var dbo = db.db("mydb");
      var myobj = { name: call.request.name, email: call.request.email, password: response.code, id: call.request.id };
      dbo.collection("users").insertOne(myobj, function (err, res) {
        if (err) throw err;
        console.log("1 document inserted");
        db.close();
      });
    });

  });
}

function findUser(call, callback) {
    //Find user in db
    MongoClient.connect(url, function (err, db) {
      if (err) throw err;
      var dbo = db.db("mydb");
      dbo.collection("users").find({email: call.request.username, password: call.request.password } ).toArray(function(err, result) {
        if (err) {
          callback(null, { message: 'User is not found' });
          throw err;
        }
        if(result.length!=0)
        callback(null, {message: 'OK'});
        else 
        callback(null, {message: 'Not found'});
        console.log(result.length);
        db.close();
      });
    });


}

function main() {
  var server = new grpc.Server();
  server.addService(proto2.RegisterService.service, { newUser: newUser, findUser: findUser });
  server.bind('0.0.0.0:50051', grpc.ServerCredentials.createInsecure());
  server.start();
}

main();
