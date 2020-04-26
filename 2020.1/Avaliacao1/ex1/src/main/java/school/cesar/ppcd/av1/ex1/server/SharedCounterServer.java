package school.cesar.ppcd.av1.ex1.server;

import java.net.ServerSocket;
import java.net.Socket;

public class SharedCounterServer {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(8888);
		while (true) {
			Socket client = server.accept();
			Thread thread = new Thread(new SharedCounterServerRunnable(client));
			thread.start();
		}
	}
}
