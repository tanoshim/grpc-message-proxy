package com.ando.grpc.facade;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import io.grpc.stub.StreamObserver;

public class MessageSender {
	
	static List<StreamHolder> listConnected = new CopyOnWriteArrayList<StreamHolder>();
	
	public static synchronized int register(io.grpc.stub.AbstractStub<?> stab, StreamObserverFacade<?> observer, String methodName) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		StreamHolder obj = new StreamHolder.Builder()
										.setStab(stab)
										.setObserver(observer)
										.setMethodName(methodName).build();
	
		listConnected.add(obj);
		return listConnected.size() - 1;
	}

	@SuppressWarnings("unchecked")
	public static synchronized <V> void send(int pos, V obj) {
		StreamObserver<?> objStreamObserverTo = listConnected.get(pos).getStreamOut();
		((StreamObserver<V>)objStreamObserverTo).onNext(obj);
		System.out.println("----------A message is sent from a client--------------");
	}

}
