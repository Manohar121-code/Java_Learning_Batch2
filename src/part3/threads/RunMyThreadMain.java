package part3.threads;

public class RunMyThreadMain {
	public static void main(String[] args) {
		System.out.println("Main Started "+ Thread.currentThread().getName());
		
		MyThread t1 = new MyThread();
		t1.setName("MyThread - 1");
		t1.start();
		
		for (int i = 1; i <= 30; i++) {
			System.out.println(i+ " "+ Thread.currentThread().getName());
		}
		
		System.out.println("Main ended "+ Thread.currentThread().getName());
	}
}
