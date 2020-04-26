package school.cesar.ppcd.av1.ex1.server;

import java.net.Socket;

public class SharedCounterServerRunnable implements Runnable {
	private Socket client;
	public SharedCounterServerRunnable(Socket client) {
		this.client = client;
	}
	public void run() {
		// TODO Auto-generated method stub

	}

}
