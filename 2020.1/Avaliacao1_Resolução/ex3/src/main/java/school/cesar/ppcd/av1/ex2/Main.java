package school.cesar.ppcd.av1.ex2;

public class Main {
	public static void main(String[] args) {
		Object mutex = 1;
		FakeLongTask fakeLongTask = new FakeLongTask(mutex);
		Thread threadFakeLongTask = new Thread(fakeLongTask);
		
		threadFakeLongTask.start();
				
		synchronized( mutex )
		{ 
		    while( !fakeLongTask.isDone() )
		    { 
		        try {
		        	Long id = Thread.currentThread().getId();
		        	System.out.println(id + ": Main Thread Waiting for notify");
					mutex.wait();
					System.out.println(id + ": Main Thread Wait Over, Received Notify");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		    }
		}	
	}
}
