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

var express = require('express')
var bodyParser = require("body-parser");
var app = express()
var cors = require('cors')
var id = 0;

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

var PROTO_PATH = __dirname + '/../../java/src/main/proto/registration.proto';

var grpc = require('grpc');
var protoLoader = require('@grpc/proto-loader');
var packageDefinition = protoLoader.loadSync(
  PROTO_PATH,
  {
    keepCase: true,
    longs: String,
    enums: String,
    defaults: true,
    oneofs: true
  });
var hello_proto = grpc.loadPackageDefinition(packageDefinition).helloworld;



app.post('/registerUser', function (req, res) {
  res.setHeader('Access-Control-Allow-Origin', 'http://localhost:3000');
  console.log(req.body.name);
  id++;
  var client = new hello_proto.RegisterService('localhost:50051', grpc.credentials.createInsecure());
  client.newUser({ name: req.body.name, email: req.body.email, id: id }, function (err, response) {
    res.send(response.message);
  });

});

app.post('/findUser', function (req, res) {
  res.setHeader('Access-Control-Allow-Origin', 'http://localhost:3000');
  console.log(req.body);
  var client = new hello_proto.RegisterService('localhost:50051', grpc.credentials.createInsecure());
  client.findUser({ username: req.body.username, password: req.body.password }, function (err, response) {
    console.log(response.message);
    res.send(response.message);
  });

});



app.use(cors());
app.listen(8000);


