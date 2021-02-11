package basics.programs;

public class SwappingNumbers {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		System.out.println(n1);
		System.out.println(n2);
		
		int temp = n2; //n2 = 20, temp = 20
		n2 = n1; //n1 = 10, n2 = 10
		n1 = temp;
		System.out.println("-----after swapping------");
		System.out.println(n1);
		System.out.println(n2);
	}
}
