package basics.methods;

public class MethodsEx {
	public static void main(String[] args) {
		System.out.println("Main started");

		sample();
		test(15);
		test2(10, "java");
		int result = returnSomething();
		System.out.println(result);

		int sum = returnSomething2(15, 20);
		System.out.println(sum);

		System.out.println("Main ended");
	}

//	accessModifier  static/Non-static returnType methodName() {
//	
//}

	public static void sample() {
		System.out.println("sample method executed");
		int i = 10;
		i++;
		System.out.println("i value - " + i);
		System.out.println("sample method ended");
		System.out.println("----------------------");
	}

	public static void test(int i) {
		System.out.println("test method executed");
		System.out.println("i value - " + i);
		System.out.println("test method ended");
		System.out.println("----------------------");
	}

	public static void test2(int i, String s) {
		System.out.println("test2 method executed");
		System.out.println("i value - " + i);
		System.out.println("s value - " + s);
		System.out.println("test2 method ended");
		System.out.println("----------------------");
	}

	public static int returnSomething() {
		System.out.println("returnSomething method executed");
		System.out.println("returnSomething method ended");
		System.out.println("----------------------");
		int i = 40;
		return i;
	}

	public static int returnSomething2(int i, int j) {
		System.out.println("----------------------");
		System.out.println("returnSomething2 method executed");
		System.out.println("returnSomething2 method ended");
		System.out.println("----------------------");
		int sum = i + j;
		return sum;
	}

}
