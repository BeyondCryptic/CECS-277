
public class SimpleThread extends Thread {
	
	private String message;
	private int count;
	
	public SimpleThread() {
		this.message = "";
		count = 0;
	}
	
	public SimpleThread(String message) {
		this.message = message;
		count = 0;
	}
	
	public void run() {
		while (count <= 9) {
			System.out.println(count + " " + message);
			try {
				this.sleep((int)(Math.random() * 10));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
		}
		if (count == 10) {
			System.out.println("DONE! " + message);
		}
	}
	
}
