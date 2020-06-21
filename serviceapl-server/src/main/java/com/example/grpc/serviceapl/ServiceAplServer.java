package com.example.grpc.serviceapl;

import io.grpc.Server;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class ServiceAplServer {
	public static void main(String[] args) throws InterruptedException, IOException {
		Server server = NettyServerBuilder.forPort(9090)
							.addService(new com.example.grpc.impl.ServiceAaaImpl())
							.addService(new com.example.grpc.impl.ServiceToraImpl())
							.build();

		server.start();

		System.out.println("server started.");

		server.awaitTermination(60, TimeUnit.SECONDS);
		
		System.out.println("server stopped.");
	}

}
