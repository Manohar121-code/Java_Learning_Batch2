package part3.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("MyThread execution started" + Thread.currentThread().getName());
		
		for (int i = 1; i <= 30; i++) {
			System.out.println(i+" - "+ Thread.currentThread().getName());
		}
		
		System.out.println("MyThread execution ended" + Thread.currentThread().getName());
	}
	
}
