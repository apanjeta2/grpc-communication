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
    comments = "Source: sendCode.proto")
public final class SendCodeServiceGrpc {

  private SendCodeServiceGrpc() {}

  public static final String SERVICE_NAME = "helloworld.SendCodeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.Email,
      io.grpc.examples.helloworld.Code> getGenerateCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateCode",
      requestType = io.grpc.examples.helloworld.Email.class,
      responseType = io.grpc.examples.helloworld.Code.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.Email,
      io.grpc.examples.helloworld.Code> getGenerateCodeMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.Email, io.grpc.examples.helloworld.Code> getGenerateCodeMethod;
    if ((getGenerateCodeMethod = SendCodeServiceGrpc.getGenerateCodeMethod) == null) {
      synchronized (SendCodeServiceGrpc.class) {
        if ((getGenerateCodeMethod = SendCodeServiceGrpc.getGenerateCodeMethod) == null) {
          SendCodeServiceGrpc.getGenerateCodeMethod = getGenerateCodeMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.Email, io.grpc.examples.helloworld.Code>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.SendCodeService", "generateCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.Email.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.Code.getDefaultInstance()))
                  .setSchemaDescriptor(new SendCodeServiceMethodDescriptorSupplier("generateCode"))
                  .build();
          }
        }
     }
     return getGenerateCodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SendCodeServiceStub newStub(io.grpc.Channel channel) {
    return new SendCodeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SendCodeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SendCodeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SendCodeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SendCodeServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static abstract class SendCodeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void generateCode(io.grpc.examples.helloworld.Email request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.Code> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateCodeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateCodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.Email,
                io.grpc.examples.helloworld.Code>(
                  this, METHODID_GENERATE_CODE)))
          .build();
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class SendCodeServiceStub extends io.grpc.stub.AbstractStub<SendCodeServiceStub> {
    private SendCodeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SendCodeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendCodeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SendCodeServiceStub(channel, callOptions);
    }

    /**
     */
    public void generateCode(io.grpc.examples.helloworld.Email request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.Code> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateCodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class SendCodeServiceBlockingStub extends io.grpc.stub.AbstractStub<SendCodeServiceBlockingStub> {
    private SendCodeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SendCodeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendCodeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SendCodeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.helloworld.Code generateCode(io.grpc.examples.helloworld.Email request) {
      return blockingUnaryCall(
          getChannel(), getGenerateCodeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class SendCodeServiceFutureStub extends io.grpc.stub.AbstractStub<SendCodeServiceFutureStub> {
    private SendCodeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SendCodeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendCodeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SendCodeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.Code> generateCode(
        io.grpc.examples.helloworld.Email request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateCodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_CODE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SendCodeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SendCodeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_CODE:
          serviceImpl.generateCode((io.grpc.examples.helloworld.Email) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.Code>) responseObserver);
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

  private static abstract class SendCodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SendCodeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.helloworld.SendCodeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SendCodeService");
    }
  }

  private static final class SendCodeServiceFileDescriptorSupplier
      extends SendCodeServiceBaseDescriptorSupplier {
    SendCodeServiceFileDescriptorSupplier() {}
  }

  private static final class SendCodeServiceMethodDescriptorSupplier
      extends SendCodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SendCodeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SendCodeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SendCodeServiceFileDescriptorSupplier())
              .addMethod(getGenerateCodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
