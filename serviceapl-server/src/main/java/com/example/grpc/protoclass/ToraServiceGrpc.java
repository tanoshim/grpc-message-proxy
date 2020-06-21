package com.example.grpc.protoclass;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: Tora.proto")
public final class ToraServiceGrpc {

  private ToraServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.protoclass.ToraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.protoclass.Tora.Req,
      com.example.grpc.protoclass.Tora.Res> getSendMessageAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessageA",
      requestType = com.example.grpc.protoclass.Tora.Req.class,
      responseType = com.example.grpc.protoclass.Tora.Res.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.protoclass.Tora.Req,
      com.example.grpc.protoclass.Tora.Res> getSendMessageAMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.protoclass.Tora.Req, com.example.grpc.protoclass.Tora.Res> getSendMessageAMethod;
    if ((getSendMessageAMethod = ToraServiceGrpc.getSendMessageAMethod) == null) {
      synchronized (ToraServiceGrpc.class) {
        if ((getSendMessageAMethod = ToraServiceGrpc.getSendMessageAMethod) == null) {
          ToraServiceGrpc.getSendMessageAMethod = getSendMessageAMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.protoclass.Tora.Req, com.example.grpc.protoclass.Tora.Res>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.protoclass.ToraService", "sendMessageA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.protoclass.Tora.Req.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.protoclass.Tora.Res.getDefaultInstance()))
                  .setSchemaDescriptor(new ToraServiceMethodDescriptorSupplier("sendMessageA"))
                  .build();
          }
        }
     }
     return getSendMessageAMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ToraServiceStub newStub(io.grpc.Channel channel) {
    return new ToraServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ToraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ToraServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ToraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ToraServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ToraServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.protoclass.Tora.Req> sendMessageA(
        io.grpc.stub.StreamObserver<com.example.grpc.protoclass.Tora.Res> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendMessageAMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageAMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.grpc.protoclass.Tora.Req,
                com.example.grpc.protoclass.Tora.Res>(
                  this, METHODID_SEND_MESSAGE_A)))
          .build();
    }
  }

  /**
   */
  public static final class ToraServiceStub extends io.grpc.stub.AbstractStub<ToraServiceStub> {
    private ToraServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToraServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToraServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToraServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.protoclass.Tora.Req> sendMessageA(
        io.grpc.stub.StreamObserver<com.example.grpc.protoclass.Tora.Res> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendMessageAMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ToraServiceBlockingStub extends io.grpc.stub.AbstractStub<ToraServiceBlockingStub> {
    private ToraServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToraServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToraServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToraServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class ToraServiceFutureStub extends io.grpc.stub.AbstractStub<ToraServiceFutureStub> {
    private ToraServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToraServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToraServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToraServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_MESSAGE_A = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ToraServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ToraServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE_A:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendMessageA(
              (io.grpc.stub.StreamObserver<com.example.grpc.protoclass.Tora.Res>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ToraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ToraServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.protoclass.Tora.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ToraService");
    }
  }

  private static final class ToraServiceFileDescriptorSupplier
      extends ToraServiceBaseDescriptorSupplier {
    ToraServiceFileDescriptorSupplier() {}
  }

  private static final class ToraServiceMethodDescriptorSupplier
      extends ToraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ToraServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ToraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ToraServiceFileDescriptorSupplier())
              .addMethod(getSendMessageAMethod())
              .build();
        }
      }
    }
    return result;
  }
}
