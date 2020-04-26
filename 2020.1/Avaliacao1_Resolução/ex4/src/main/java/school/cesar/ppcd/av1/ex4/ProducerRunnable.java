package school.cesar.ppcd.av1.ex4;

import static school.cesar.ppcd.av1.ex4.Util.randomSleep;

import java.util.UUID;

public class ProducerRunnable implements Runnable {
	private ProducerConsumer producerConsumer;
	
	public ProducerRunnable(ProducerConsumer producerConsumer) {
		this.producerConsumer = producerConsumer;
	}

	public void run() {
		while (true) {
			SomeRequest request = new SomeRequest(UUID.randomUUID().toString());
			System.out.println("Produtur produziu " + request);
			producerConsumer.produce(request);
			System.out.println(String.format("Produtor parou %d ms", randomSleep()));
		}
	}

}
