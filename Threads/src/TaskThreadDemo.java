import java.util.concurrent.*;


public class TaskThreadDemo {
	public static void main(String[] args) {
		TaskThread one = new TaskThread(0);
		TaskThread two = new TaskThread(1);
		TaskThread three = new TaskThread(2);
		TaskThread four = new TaskThread(3);
		ExecutorService executorOne = Executors.newFixedThreadPool(2);
		ExecutorService executorTwo = Executors.newFixedThreadPool(2);
		executorOne.execute(one);
		executorOne.execute(two);
		executorOne.shutdown();
		try {
			if (executorOne.awaitTermination(2750, TimeUnit.MILLISECONDS)) {
				// This is just a delay.
				// Blank so the next few lines always executes!
			}
			executorTwo.execute(three);
			executorTwo.execute(four);
			executorTwo.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
