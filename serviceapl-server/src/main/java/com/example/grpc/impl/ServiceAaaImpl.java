package com.example.grpc.impl;

import io.grpc.stub.StreamObserver;

import com.ando.grpc.facade.StreamObserverFacadeImpl;
import com.example.grpc.messagehandler.AaaMessageHandler;
import com.example.grpc.protoclass.AAA;
import com.example.grpc.protoclass.aaaGrpc;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ServiceAaaImpl extends aaaGrpc.aaaImplBase {
	private static List<StreamObserver<AAA.A001Response>> observers = new CopyOnWriteArrayList<StreamObserver<AAA.A001Response>>();

	@Override
	public StreamObserver<AAA.A001> serviceApl(StreamObserver<AAA.A001Response> responseObserver) {
		System.out.println("adding a new observer : " + responseObserver.toString());
		observers.add(responseObserver);

		StreamObserver<AAA.A001> objStreamObserver = new StreamObserverFacadeImpl<AAA.A001>(new AaaMessageHandler(responseObserver));

		return objStreamObserver;
	}

	boolean broadcast(AAA.A001Response message) {
		for (StreamObserver<AAA.A001Response> observer : observers) {
			observer.onNext(message);
		}
		return true;
	}
}
