# Features

## 1. Capture all the outgoing gRPC messages with a single class
![alt](https://github.com/tanoshim/grpc-message-facade/blob/master/pic/grpc-message-facade%20-%20out.png)

## 2. Capture all the incomming gRPC messages with a single class
![alt](https://github.com/tanoshim/grpc-message-facade/blob/master/pic/grpc-message-facade%20-%20in.png)

*Only available for Client Streaming and Bidirectional streaming RPC

# How to Build
```
mvn clean install
```
# How to Import Projects Into Eclipse
1. Type the following command in the Windows command prompt.
```
mvn eclipse:eclipse
```
2. Start eclipse and import projects.


# How to Test
Run the server and the client both on eclipse.
## 1. Run a Server
1. In serviceapl-server, right click com.example.grpc.serviceapl.ServiceAplServer.java and select Run as > Java application.
*The server stops after 60 seconds
## 2. Run a Client
1. In serviceapl-client, right click com.example.grpc.tester.ServiceAplLauncher.java and select Run as > Java application.


# How to Add a New Protobuf Class
1. Create a proto file in serviceapl-server\src\main\proto and build (mvn clean install). And new two java files are created under the target directory.
1. Copy the two created files to com.example.grpc.protoclass in serviceapl-server.
1. Create ServiceXxxImpl under com.example.grpc.impl in serviceapl-server.
1. Create a message handler for a new class in serviceapl-server.
1. Create a message handler for a new class in serviceapl-client.
1. Add a new service(ServiceXxxImpl) in ServiceAplServer Class.
	1. NettyServerBuilder.addService(new ServiceXxxImpl())
1. Register a new stub in ServiceAplClient Class.
	1. MessageSender.register(XxxServiceGrpc.newStub(channel), ...);
1. Add a message to send in ServiceAplClient Class.
	1. MessageSender.send(XXX.XX.newBuilder().setMsg("hello").build())

# Potential Enhancement
- Auto-code-generation.
In order to omit sevral steps in "How to Add a New Protobuf Class"
- Multithreading/Thread safe
