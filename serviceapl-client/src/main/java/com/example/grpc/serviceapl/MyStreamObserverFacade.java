package com.example.grpc.serviceapl;

import com.ando.grpc.facade.MessageHandler;
import com.ando.grpc.facade.StreamObserverFacade;

public final class MyStreamObserverFacade<V> extends StreamObserverFacade<V> {
	
	public MyStreamObserverFacade(MessageHandler<V> callback) {
		super(callback);
	}

	@Override
	public void onNext(V arg) {
		System.out.println("MyStreamObserverFacade::onNext");
		
	
		if(doSomeVerifications(arg))callback.onNext(arg);		
	}
	
	private boolean doSomeVerifications(V arg) {
		System.out.println("Verification OK.");
		return true;
	}

}
