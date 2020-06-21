package com.example.grpc.serviceapl;

import java.lang.reflect.InvocationTargetException;

import com.ando.grpc.facade.MessageSender;
import com.ando.grpc.facade.StreamObserverFacadeImpl;
import com.example.grpc.messagehandler.AaaMessageHandler;
import com.example.grpc.messagehandler.ToraMessageHandler;
import com.example.grpc.protoclass.AAA;
import com.example.grpc.protoclass.Tora;
import com.example.grpc.protoclass.ToraServiceGrpc;
import com.example.grpc.protoclass.aaaGrpc;
import com.example.grpc.tester.ExampleWindow;

import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class ServiceAplClient extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		ExampleWindow.createWindow(primaryStage);
		
		ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 9090).usePlaintext(true).build();
		int serviceApl = MessageSender.register(aaaGrpc.newStub(channel), new StreamObserverFacadeImpl<AAA.A001Response>(new AaaMessageHandler()), "serviceApl");
		int sendMessageA = MessageSender.register(ToraServiceGrpc.newStub(channel), new StreamObserverFacadeImpl<Tora.Res>(new ToraMessageHandler()), "sendMessageA");

		/*
		 * button-pressed handler
		 * */		
		ExampleWindow.getButton().setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg) {
				MessageSender.send(sendMessageA, Tora.Req.newBuilder().setMsg1(ExampleWindow.getText()).setMsg2("fa444").build());
//				MessageSender.send(serviceApl, AAA.A001.newBuilder().setMsg(ExampleWindow.getText()).build());
			}
		});

	}

}
