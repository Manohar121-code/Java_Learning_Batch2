package part3.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("MyRunnable execution started " + Thread.currentThread().getName());

		for (int i = 1; i <= 25; i++) {
			System.out.println(i + " - " + Thread.currentThread().getName());
		}

		System.out.println("MyRunnable execution ended " + Thread.currentThread().getName());
	}

}
