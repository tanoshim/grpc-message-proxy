# Goal
- Controll all the incoming and outgoing gRPC messages in one class (before sending/receiving messages) like a message gateway.
- Easy to manage many protobuf classes with a simple structure.
Warning:This is not a common way to capture all the incoming/outgoing messages. Use ServerInterceptor if you want to do the same thing in a standard way.

# Features
## 1. Capturing all the outgoing gRPC messages with a single class
![alt](https://github.com/tanoshim/grpc-message-facade/blob/master/pic/grpc-message-facade%20-%20out.png)

## 2. Capturing all the incomming gRPC messages with a single class
![alt](https://github.com/tanoshim/grpc-message-facade/blob/master/pic/grpc-message-facade%20-%20in.png)

*Only available for Client-Streaming and Bidirectional-Streaming RPC


# How to Import Projects Into Eclipse
1. Run the following command with the Windows command prompt in the root of the project directory.
```
mvn eclipse:eclipse
```
2. Start eclipse and import projects.

# How to Add a New Protobuf Class
1. Create a proto file in serviceapl-server\src\main\proto and build. And new two java files are created under the target directory.
1. Copy the two created files to com.example.grpc.protoclass in serviceapl-server.
1. Create ServiceXxxImpl under com.example.grpc.impl in serviceapl-server.
1. Create a message handler for a new protobuf class in serviceapl-server.
1. Create a message handler for a new protobuf class in serviceapl-client.
1. Add a new service(ServiceXxxImpl) in ServiceAplServer Class.
	1. NettyServerBuilder.addService(new ServiceXxxImpl())
1. Register a new stub in ServiceAplClient Class.
	1. MessageSender.register(XxxServiceGrpc.newStub(channel), ...);
1. Add a message to send in ServiceAplClient Class.
	1. MessageSender.send(XXX.XX.newBuilder().setMsg("hello").build())

# How to Test
Run the server and the client both on eclipse.
## 1. Run a Server
1. In serviceapl-server, right click com.example.grpc.serviceapl.ServiceAplServer.java and select Run as > Java application.
*The server stops after 60 seconds automatically.
## 2. Run a Client
1. In serviceapl-client, right click com.example.grpc.tester.Launcher.java and select Run as > Java application.

# How to Build
```
mvn clean install
```

# Potential Enhancement
- Auto-code-generation.
In order to omit steps in "How to Add a New Protobuf Class"
- Multithreading/Thread safe
