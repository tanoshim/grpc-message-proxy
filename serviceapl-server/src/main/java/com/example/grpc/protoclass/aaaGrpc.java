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
    comments = "Source: AAA.proto")
public final class aaaGrpc {

  private aaaGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.aaa.aaa";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.protoclass.AAA.A001,
      com.example.grpc.protoclass.AAA.A001Response> getServiceAplMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serviceApl",
      requestType = com.example.grpc.protoclass.AAA.A001.class,
      responseType = com.example.grpc.protoclass.AAA.A001Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.protoclass.AAA.A001,
      com.example.grpc.protoclass.AAA.A001Response> getServiceAplMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.protoclass.AAA.A001, com.example.grpc.protoclass.AAA.A001Response> getServiceAplMethod;
    if ((getServiceAplMethod = aaaGrpc.getServiceAplMethod) == null) {
      synchronized (aaaGrpc.class) {
        if ((getServiceAplMethod = aaaGrpc.getServiceAplMethod) == null) {
          aaaGrpc.getServiceAplMethod = getServiceAplMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.protoclass.AAA.A001, com.example.grpc.protoclass.AAA.A001Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.aaa.aaa", "serviceApl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.protoclass.AAA.A001.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.protoclass.AAA.A001Response.getDefaultInstance()))
                  .setSchemaDescriptor(new aaaMethodDescriptorSupplier("serviceApl"))
                  .build();
          }
        }
     }
     return getServiceAplMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static aaaStub newStub(io.grpc.Channel channel) {
    return new aaaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static aaaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new aaaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static aaaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new aaaFutureStub(channel);
  }

  /**
   */
  public static abstract class aaaImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.protoclass.AAA.A001> serviceApl(
        io.grpc.stub.StreamObserver<com.example.grpc.protoclass.AAA.A001Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getServiceAplMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getServiceAplMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.grpc.protoclass.AAA.A001,
                com.example.grpc.protoclass.AAA.A001Response>(
                  this, METHODID_SERVICE_APL)))
          .build();
    }
  }

  /**
   */
  public static final class aaaStub extends io.grpc.stub.AbstractStub<aaaStub> {
    private aaaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private aaaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected aaaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new aaaStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.protoclass.AAA.A001> serviceApl(
        io.grpc.stub.StreamObserver<com.example.grpc.protoclass.AAA.A001Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getServiceAplMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class aaaBlockingStub extends io.grpc.stub.AbstractStub<aaaBlockingStub> {
    private aaaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private aaaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected aaaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new aaaBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class aaaFutureStub extends io.grpc.stub.AbstractStub<aaaFutureStub> {
    private aaaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private aaaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected aaaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new aaaFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SERVICE_APL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final aaaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(aaaImplBase serviceImpl, int methodId) {
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
        case METHODID_SERVICE_APL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.serviceApl(
              (io.grpc.stub.StreamObserver<com.example.grpc.protoclass.AAA.A001Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class aaaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    aaaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.protoclass.AAA.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("aaa");
    }
  }

  private static final class aaaFileDescriptorSupplier
      extends aaaBaseDescriptorSupplier {
    aaaFileDescriptorSupplier() {}
  }

  private static final class aaaMethodDescriptorSupplier
      extends aaaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    aaaMethodDescriptorSupplier(String methodName) {
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
      synchronized (aaaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new aaaFileDescriptorSupplier())
              .addMethod(getServiceAplMethod())
              .build();
        }
      }
    }
    return result;
  }
}
