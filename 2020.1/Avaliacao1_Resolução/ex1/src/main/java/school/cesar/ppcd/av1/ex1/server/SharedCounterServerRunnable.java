package school.cesar.ppcd.av1.ex1.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class SharedCounterServerRunnable implements Runnable {
	private Socket client;
	private DataOutputStream dataOutputStream;
	private DataInputStream dataInputStream;
	private static AtomicInteger counter = new AtomicInteger();
	
	public SharedCounterServerRunnable(Socket client) throws IOException {
		this.client = client;
		this.dataInputStream = new DataInputStream(client.getInputStream());
		this.dataOutputStream = new DataOutputStream(client.getOutputStream());
	}
	
	public void run() {
        try {
        	while(true) {
	        	int currentValue = this.counter.getAndIncrement();
				this.dataOutputStream.writeInt(currentValue);
				System.out.println("Counter : " + currentValue);
				
				// Coloquei um sleep só pra dar pra acompanhar os valores sendo printados
				TimeUnit.SECONDS.sleep(1);
        	}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
