package school.cesar.ppcd.av1.ex4;

public class Main {
	public static void main(String[] args) throws Exception {
		ProducerConsumer producerConsumer = new ProducerConsumerImpl();
		ConsumerRunnable consumerRunnable = new ConsumerRunnable(producerConsumer);
		ProducerRunnable producerRunnable = new ProducerRunnable(producerConsumer);
		Thread threadProducer = new Thread(producerRunnable);
		Thread threadConsumer = new Thread(consumerRunnable);
		threadProducer.start();
		threadConsumer.start();
		threadProducer.join();
		threadConsumer.join();
	}
}
