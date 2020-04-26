package school.cesar.ppcd.av1.ex1.client;

import java.net.Socket;

import school.cesar.ppcd.av1.ex1.server.SharedCounterServerRunnable;

public class SharedCounterClient {
	public static void main(String[] args) throws Exception {
		Socket client = new Socket("127.0.0.1", 8888);
		Thread thread = new Thread(new SharedCounterServerRunnable(client));
		thread.start();
		thread.join();
	}
}
