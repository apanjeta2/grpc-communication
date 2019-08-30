package io.grpc.examples.helloworld;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: registration.proto")
public final class RegisterServiceGrpc {

  private RegisterServiceGrpc() {}

  public static final String SERVICE_NAME = "helloworld.RegisterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.User,
      io.grpc.examples.helloworld.ReplyMessage> getNewUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "newUser",
      requestType = io.grpc.examples.helloworld.User.class,
      responseType = io.grpc.examples.helloworld.ReplyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.User,
      io.grpc.examples.helloworld.ReplyMessage> getNewUserMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.User, io.grpc.examples.helloworld.ReplyMessage> getNewUserMethod;
    if ((getNewUserMethod = RegisterServiceGrpc.getNewUserMethod) == null) {
      synchronized (RegisterServiceGrpc.class) {
        if ((getNewUserMethod = RegisterServiceGrpc.getNewUserMethod) == null) {
          RegisterServiceGrpc.getNewUserMethod = getNewUserMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.User, io.grpc.examples.helloworld.ReplyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.RegisterService", "newUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.ReplyMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new RegisterServiceMethodDescriptorSupplier("newUser"))
                  .build();
          }
        }
     }
     return getNewUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.LoginUser,
      io.grpc.examples.helloworld.ReplyMessage> getFindUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findUser",
      requestType = io.grpc.examples.helloworld.LoginUser.class,
      responseType = io.grpc.examples.helloworld.ReplyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.LoginUser,
      io.grpc.examples.helloworld.ReplyMessage> getFindUserMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.LoginUser, io.grpc.examples.helloworld.ReplyMessage> getFindUserMethod;
    if ((getFindUserMethod = RegisterServiceGrpc.getFindUserMethod) == null) {
      synchronized (RegisterServiceGrpc.class) {
        if ((getFindUserMethod = RegisterServiceGrpc.getFindUserMethod) == null) {
          RegisterServiceGrpc.getFindUserMethod = getFindUserMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.LoginUser, io.grpc.examples.helloworld.ReplyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.RegisterService", "findUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.LoginUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.ReplyMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new RegisterServiceMethodDescriptorSupplier("findUser"))
                  .build();
          }
        }
     }
     return getFindUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegisterServiceStub newStub(io.grpc.Channel channel) {
    return new RegisterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegisterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RegisterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegisterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RegisterServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static abstract class RegisterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void newUser(io.grpc.examples.helloworld.User request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.ReplyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getNewUserMethod(), responseObserver);
    }

    /**
     */
    public void findUser(io.grpc.examples.helloworld.LoginUser request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.ReplyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.User,
                io.grpc.examples.helloworld.ReplyMessage>(
                  this, METHODID_NEW_USER)))
          .addMethod(
            getFindUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.LoginUser,
                io.grpc.examples.helloworld.ReplyMessage>(
                  this, METHODID_FIND_USER)))
          .build();
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class RegisterServiceStub extends io.grpc.stub.AbstractStub<RegisterServiceStub> {
    private RegisterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegisterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegisterServiceStub(channel, callOptions);
    }

    /**
     */
    public void newUser(io.grpc.examples.helloworld.User request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.ReplyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findUser(io.grpc.examples.helloworld.LoginUser request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.ReplyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class RegisterServiceBlockingStub extends io.grpc.stub.AbstractStub<RegisterServiceBlockingStub> {
    private RegisterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegisterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegisterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.helloworld.ReplyMessage newUser(io.grpc.examples.helloworld.User request) {
      return blockingUnaryCall(
          getChannel(), getNewUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.helloworld.ReplyMessage findUser(io.grpc.examples.helloworld.LoginUser request) {
      return blockingUnaryCall(
          getChannel(), getFindUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class RegisterServiceFutureStub extends io.grpc.stub.AbstractStub<RegisterServiceFutureStub> {
    private RegisterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegisterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegisterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.ReplyMessage> newUser(
        io.grpc.examples.helloworld.User request) {
      return futureUnaryCall(
          getChannel().newCall(getNewUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.ReplyMessage> findUser(
        io.grpc.examples.helloworld.LoginUser request) {
      return futureUnaryCall(
          getChannel().newCall(getFindUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEW_USER = 0;
  private static final int METHODID_FIND_USER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegisterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegisterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEW_USER:
          serviceImpl.newUser((io.grpc.examples.helloworld.User) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.ReplyMessage>) responseObserver);
          break;
        case METHODID_FIND_USER:
          serviceImpl.findUser((io.grpc.examples.helloworld.LoginUser) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.ReplyMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RegisterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegisterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.helloworld.RegistrationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegisterService");
    }
  }

  private static final class RegisterServiceFileDescriptorSupplier
      extends RegisterServiceBaseDescriptorSupplier {
    RegisterServiceFileDescriptorSupplier() {}
  }

  private static final class RegisterServiceMethodDescriptorSupplier
      extends RegisterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegisterServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RegisterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegisterServiceFileDescriptorSupplier())
              .addMethod(getNewUserMethod())
              .addMethod(getFindUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
