package com.example.grpc.messagehandler;

import com.google.protobuf.Timestamp;
import com.ando.grpc.facade.MessageHandler;
import com.example.grpc.protoclass.AAA;
import com.example.grpc.protoclass.AAA.A001Response;
import com.example.grpc.protoclass.Tora;

import io.grpc.stub.StreamObserver;

public class ToraMessageHandler extends MessageHandler<Tora.Req>{
	StreamObserver<Tora.Res>observer;

	public ToraMessageHandler(StreamObserver<Tora.Res> responseObserver) {
		this.observer = responseObserver;
	}

	public void onNext(Tora.Req value) {
		System.out.println("ToraMessageHandler::onNext .Tora.(server side)...");
		System.out.println(value.toString());
		
		Tora.Res message = Tora.Res.newBuilder()
				.setStat(3200).setTimestamp(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / 1000))
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
