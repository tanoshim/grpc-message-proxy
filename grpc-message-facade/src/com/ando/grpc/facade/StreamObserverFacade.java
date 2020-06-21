package com.ando.grpc.facade;

import io.grpc.stub.StreamObserver;

public abstract class StreamObserverFacade<V> implements StreamObserver<V> {
	
	protected MessageHandler<V> callback;

	public StreamObserverFacade(MessageHandler<V> callback){
		this.callback = callback;
	}
		
	@Override
	public void onError(Throwable t) {
		t.printStackTrace();
		System.out.println("StreamObserverFacade::onError");
		callback.onError(t);
	}

	@Override
	public void onCompleted() {
		System.out.println("StreamObserverFacade::onCompleted");
		callback.onCompleted();
	}

	@Override
	public void onNext(V arg) {
		System.out.println("StreamObserverFacade::onNext");
		callback.onNext(arg);		
	}

}

