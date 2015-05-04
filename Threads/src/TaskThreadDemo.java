import java.util.concurrent.*;


public class TaskThreadDemo {
	public static void main(String[] args) {
		Thread one = new Thread(new TaskThread(0));
		Thread two = new Thread(new TaskThread(1));
		Thread three = new Thread(new TaskThread(2));
		Thread four = new Thread(new TaskThread(3));
		one.start();
		two.start();
		while (one.isAlive() && two.isAlive()) {
			// Does nothing but makes sure only two threads are active.
		}
		three.start();
		while (one.isAlive() || two.isAlive()) {
			// Does nothing but makes sure only two threads are active.
		}
		four.start();
	}
}
