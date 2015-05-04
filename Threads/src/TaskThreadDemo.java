import java.util.concurrent.*;


public class TaskThreadDemo {
	public static void main(String[] args) {
		TaskThread one = new TaskThread(0);
		TaskThread two = new TaskThread(1);
		TaskThread three = new TaskThread(2);
		TaskThread four = new TaskThread(3);
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(one);
		executor.execute(two);
		try {
			if (executor.awaitTermination(2750, TimeUnit.MILLISECONDS)) {
				// This is just a delay.
				// Blank so the next few lines always executes!
			}
			executor.execute(three);
			executor.execute(four);
			executor.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}