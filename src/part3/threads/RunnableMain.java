package part3.threads;

public class RunnableMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Started");
		MyRunnable myRunn = new MyRunnable();
		Thread t1 = new Thread(myRunn, "t1");
		t1.setPriority(1);
		t1.setDaemon(true);
		t1.start();
		
		t1.join();
		
		MyRunnable myRunn2 = new MyRunnable();
		Thread t2 = new Thread(myRunn2, "t2");
		t2.start();
		System.out.println("Main ended");
	}
}
