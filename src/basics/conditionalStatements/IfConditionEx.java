package basics.conditionalStatements;

public class IfConditionEx {
	public static void main(String[] args) {
		System.out.println("main() started");
		// ==, !=, <, >, <=, >=, ||, &&
		
		int i = 10;
		//if condition
		if(i > 5) {
			System.out.println("if condition executed");
		}
		System.out.println("----------------------------");
		
		if(i < 5) {
			System.out.println("if condition executed");
		} else {
			System.out.println("else condition executed");
		}
		System.out.println("----------------------------");
		
		int k = 20;
		if(k < 20) {
			System.out.println("if executed k value - "+ k);
		} else if (k > 20) {
			System.out.println("else if executed k value - "+ k);
		} else {
			System.out.println("else executed k value - "+ k);
		}
		System.out.println("----------------------------");
		int l = 30;
		if(l < 20 || l == 30) {
			System.out.println("OR condition executed");
		}
		
		if (l > 20 && l == 30) {
			System.out.println("AND condition executed");
		}
		
		if (l>= 30 && (l < 20 || l == 30)) {
			System.out.println("l>= 30 && (l < 20 || l == 30) - true");
		}
		
		System.out.println("----------------------------");
		
		System.out.println("main() ended");
	}
}
