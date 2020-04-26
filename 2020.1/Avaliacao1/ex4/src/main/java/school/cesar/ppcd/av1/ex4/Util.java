package school.cesar.ppcd.av1.ex4;

import java.util.Random;

public class Util {
	public static long randomSleep() {
		if (new Random().nextInt(10) > 2)
			return 0;
		long sleep = new Random().nextInt(1000) + 500;
		try {
			Thread.currentThread().sleep(sleep);
		} catch (InterruptedException e) {
		}
		return sleep;
	}
}
