package school.cesar.ppcd.av1.ex1.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SharedCounterClientRunnable implements Runnable {
	private Socket socket;
	private DataOutputStream dataOutputStream;
	private DataInputStream dataInputStream;
	private static final byte[] INC = new byte[] { 'I' };

	public SharedCounterClientRunnable(Socket socket) throws IOException {
		this.socket = socket;
		this.dataInputStream = new DataInputStream(socket.getInputStream());
		this.dataOutputStream = new DataOutputStream(socket.getOutputStream());
	}

	public void run() {
		try {
			int counter;
			while (true) {
				this.dataOutputStream.write(INC);
				counter = this.dataInputStream.readInt();
				System.out.println(counter);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
