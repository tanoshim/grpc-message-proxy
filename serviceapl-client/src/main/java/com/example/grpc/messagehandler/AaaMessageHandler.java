package com.example.grpc.messagehandler;

import com.ando.grpc.facade.MessageHandler;
import com.example.grpc.protoclass.AAA;

public class AaaMessageHandler extends MessageHandler<AAA.A001Response>{

	public void onNext(AAA.A001Response value) {
		System.out.println("AaaMessageHandler::onNext .AAA..client..");
		System.out.println(value.toString());		
	}

	@Override
	public void onError(Throwable t) {
	}

	@Override
	public void onCompleted() {
	}
}
