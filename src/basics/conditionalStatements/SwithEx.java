package basics.conditionalStatements;

public class SwithEx {
	public static void main(String[] args) {
		int i = 200;
		switch (i) {
		case 10:
			System.out.println("case 10 executed");
			break;
		case 20:
			System.out.println("case 20 executed");
			break;
		case 30:
			System.out.println("case 30 executed");
			break;
		default:
			System.out.println("default case executed");
			break;
		}
	}
}
