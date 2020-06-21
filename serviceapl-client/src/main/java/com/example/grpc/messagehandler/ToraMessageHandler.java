package com.example.grpc.messagehandler;

import com.ando.grpc.facade.MessageHandler;
import com.example.grpc.protoclass.Tora;

public class ToraMessageHandler extends MessageHandler<Tora.Res>{

	public void onNext(Tora.Res value) {
		System.out.println("ToraMessageHandler::onNext .Tora..client..");
		System.out.println(value.toString());		
	}

	@Override
	public void onError(Throwable t) {
	}

	@Override
	public void onCompleted() {
	}
}
