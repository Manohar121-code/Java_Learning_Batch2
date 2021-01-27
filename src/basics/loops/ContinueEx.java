package basics.loops;

public class ContinueEx {
	public static void main(String[] args) {
		for (int j = 1; j <= 10; j++) {
			if (j == 3) {
				continue;
			}
			System.out.println(j);
		}
	}
}
