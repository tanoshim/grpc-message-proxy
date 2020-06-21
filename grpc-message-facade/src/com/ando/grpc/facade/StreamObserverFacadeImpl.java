package com.ando.grpc.facade;

public final class StreamObserverFacadeImpl<V> extends StreamObserverFacade<V> {

	public StreamObserverFacadeImpl(MessageHandler<V> callback) {
		super(callback);
	}

}
