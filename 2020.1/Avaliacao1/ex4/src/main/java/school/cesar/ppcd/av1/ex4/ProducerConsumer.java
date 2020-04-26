package school.cesar.ppcd.av1.ex4;

public interface ProducerConsumer {
	public void produce(SomeRequest request);
	public SomeRequest consume();
}
