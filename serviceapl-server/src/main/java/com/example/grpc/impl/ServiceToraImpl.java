package com.example.grpc.impl;

import io.grpc.stub.StreamObserver;
import com.ando.grpc.facade.StreamObserverFacadeImpl;
import com.example.grpc.messagehandler.ToraMessageHandler;
import com.example.grpc.protoclass.Tora;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ServiceToraImpl extends com.example.grpc.protoclass.ToraServiceGrpc.ToraServiceImplBase {
	private static List<StreamObserver<Tora.Res>> observers = new CopyOnWriteArrayList<StreamObserver<Tora.Res>>();

	@Override
	public StreamObserver<Tora.Req> sendMessageA(StreamObserver<Tora.Res> responseObserver) {
		System.out.println("adding a new observer : " + responseObserver.toString());
		observers.add(responseObserver);

		StreamObserver<Tora.Req> objStreamObserver = new StreamObserverFacadeImpl<Tora.Req>(new ToraMessageHandler(responseObserver));

		return objStreamObserver;
	}

	boolean broadcast(Tora.Res message) {
		for (StreamObserver<Tora.Res> observer : observers) {
			observer.onNext(message);
		}
		return true;
	}
}
