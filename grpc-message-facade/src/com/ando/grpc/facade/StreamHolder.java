package com.ando.grpc.facade;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import io.grpc.stub.StreamObserver;

public final class StreamHolder {

	private StreamObserver<?> streamIn;
	private StreamObserver<?> streamOut;

	public StreamObserver<?> getStreamOut() {
		return streamOut;
	}

	public StreamObserver<?> getStreamIn() {
		return streamIn;
	}
	
	public static class Builder {
		MessageHandler<?> callback;
		StreamObserver<?> observer;
		io.grpc.stub.AbstractStub<?> stab;
		String methodName;

		public Builder setCallback(MessageHandler<?> callback) {
			this.callback = callback;
			return this;
		}
		
		public Builder setObserver(StreamObserver<?> observer) {
			this.observer = observer;
			return this;
		}

		public Builder setMethodName(String methodName) {
			this.methodName = methodName;
			return this;
		}

		public Builder setStab(io.grpc.stub.AbstractStub<?> stab) {
			this.stab = stab;
			return this;
		}

		public StreamHolder build() 
				throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			
			StreamHolder observer = new StreamHolder();
			
			Class<?> clazz = stab.getClass();
			Method method = clazz.getMethod(methodName, StreamObserver.class);
			observer.streamIn = this.observer;
			observer.streamOut = (StreamObserver<?>) method.invoke(stab, observer.streamIn);

			return observer;
		}
	}

}
