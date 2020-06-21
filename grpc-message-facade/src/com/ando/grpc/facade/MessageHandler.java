package com.ando.grpc.facade;

public abstract class MessageHandler<V> {
	public abstract void onNext(V arg0) ;
	public abstract void onError(Throwable t);
	public abstract void onCompleted();

}
