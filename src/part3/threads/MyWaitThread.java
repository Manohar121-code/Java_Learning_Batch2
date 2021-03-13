package part3.threads;

public class MyWaitThread extends Thread {

	@Override
	public void run() {
		System.out.println("MyThread execution started" + Thread.currentThread().getName());
		
		try {
			wait(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MyThread execution ended" + Thread.currentThread().getName());
	}
	
}
