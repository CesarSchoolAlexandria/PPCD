package school.cesar.ppcd.av1.ex2;

import static school.cesar.ppcd.av1.ex2.Util.nap;

public class FakeLongTask implements Runnable {
	Object mutex = new Object();
	private boolean done = false;
	private static final long ONE_MINUTE = 60 * 1000;
	
	public FakeLongTask(Object mutex){
        this.mutex = mutex;
    }

	public void run() {
		synchronized (mutex){
    		Long id = Thread.currentThread().getId();
    		System.out.println(id + ": Thread Running, taking a one minute Nap");
	    	nap(ONE_MINUTE);
    	    done = true;
    	    System.out.println(id + ": Thread Over, notifying");
    	    mutex.notify();
    	}
	}
	
	public boolean isDone() {
		return done;
	}
}
