# Features

## 1. Capture all the outgoing gRPC messages with a single class
![alt](https://github.com/tanoshim/grpc-message-facade/blob/master/pic/grpc-message-facade%20-%20out.png)

### sample code
```
MessageSender.send(serviceApl, AAA.A001.newBuilder().setMsg("hello").build());

```
## 2. Capture all the incomming gRPC messages with a single class
![alt](https://github.com/tanoshim/grpc-message-facade/blob/master/pic/grpc-message-facade%20-%20in.png)
### sample code
```
public final class MyStreamObserverFacade<V> extends StreamObserverFacade<V> {
	protected MessageHandler<V> callback;
	@Override
	public void onNext(V arg) {
		callback.onNext(arg);		
	}
}
```

# Class Descriptions
## serviceapl-client
#### Class MyStreamObserverFacade:gRPC message receiver. A concrete class of StreamObserverFacade which receives all the in-comming message from the server.
#### Class ServiceAplClient:Message sender client.
#### Class AaaMessageHandler:gRPC concrete message handler. Each message handler corresponds to a protobuf data. 

## serviceapl-server
#### Class ServiceAplServer:Server 
#### Class ServiceAaaImpl:
#### Class AaaMessageHandler:gRPC concrete message handler. Each message handler corresponds to a protobuf data. 
#### Class AaaServiceGrpc:gRPC auto-generated class
#### Class Aaa: gRPC auto-generated class

# How to Build
```
mvn clean install
```
# How to Test
Run the server and the client both on eclipse.
## 1. Run a Server
1. In click serviceapl-server, right click com.example.grpc.serviceapl.ServiceAplServer.java and select Run as > Java application.
* The server stops after 60 seconds
## 2. Run a Client
1. In click serviceapl-client, right click com.example.grpc.tester.ServiceAplLauncher.java and select Run as > Java application.


# How to Add a New Protobuf Class
1. Create a proto file and build (mvn clean install). And new files are created.
1. Copy the 2 created file under com.example.grpc.protoclass in serviceapl-server.
1. Create ServiceXxxImpl under com.example.grpc.impl in serviceapl-server.
1. Create a message handler for a new class in serviceapl-server.
1. Create a message handler for a new class in serviceapl-client.
1. Add a new service in the server in ServiceAplServer.
1. Register a new stub in MessageSender in ServiceAplClient.
1. Add a message to send in the handle method in ServiceAplClient.


