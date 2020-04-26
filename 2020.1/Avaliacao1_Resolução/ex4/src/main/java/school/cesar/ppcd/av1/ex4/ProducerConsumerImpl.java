package school.cesar.ppcd.av1.ex4;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerImpl implements ProducerConsumer {

	private Queue<SomeRequest> buffer;
	private int size;
	Object mutex = new Object();

    public ProducerConsumerImpl() {
        this.buffer = new LinkedList<SomeRequest>();
        this.size = 2;
    }
	
	public void produce(SomeRequest request) {
        synchronized (mutex) {        	
            while (buffer.size() >= size) {
                try {
                	System.out.println("Produtor parou porque o número de recurso máximo foi atingido.");
					mutex.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            }
            buffer.add(request);
            mutex.notify();
        }	
	}

	public SomeRequest consume() {
		synchronized (mutex) {

	        while (buffer.size() == 0) {
	        	try {
	        		System.out.println("Consumidor parou porque não tem recurso para consumir.");
					mutex.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	
	        SomeRequest consumed = buffer.poll();
	        mutex.notify();
	        return consumed;
		}
		
		
	}
}
