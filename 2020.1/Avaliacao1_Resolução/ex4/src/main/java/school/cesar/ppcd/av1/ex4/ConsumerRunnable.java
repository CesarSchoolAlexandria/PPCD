package school.cesar.ppcd.av1.ex4;

import static school.cesar.ppcd.av1.ex4.Util.randomSleep;

public class ConsumerRunnable implements Runnable {
	private ProducerConsumer producerConsumer;
	
	public ConsumerRunnable(ProducerConsumer producerConsumer) {
		this.producerConsumer = producerConsumer;
	}

	public void run() {
		while (true) {
			SomeRequest request = producerConsumer.consume();
			System.out.println("Consumiu " + request);
			System.out.println(String.format("Consumidor parou %d ms", randomSleep()));
		}
		
	}

}
