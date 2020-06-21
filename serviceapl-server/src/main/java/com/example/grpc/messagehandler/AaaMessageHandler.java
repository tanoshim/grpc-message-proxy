package com.example.grpc.messagehandler;

import com.google.protobuf.Timestamp;
import com.ando.grpc.facade.MessageHandler;
import com.example.grpc.protoclass.AAA;
import com.example.grpc.protoclass.AAA.A001Response;

import io.grpc.stub.StreamObserver;

public class AaaMessageHandler extends MessageHandler<AAA.A001>{
	StreamObserver<AAA.A001Response>observer;

	public AaaMessageHandler(StreamObserver<A001Response> responseObserver) {
		this.observer = responseObserver;
	}

	public void onNext(AAA.A001 value) {
		System.out.println("AaaMessageHandler::onNext .AAA.(server side)...");
		System.out.println(value.toString());
		
		AAA.A001Response message = AAA.A001Response.newBuilder()
				.setMessage(value).setTimestamp(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / 1000))
				.build();
		
		observer.onNext(message);
		System.out.println("----------A message is sent back to a client--------------");
	}

	@Override
	public void onError(Throwable t) {
	}

	@Override
	public void onCompleted() {
	}
}
