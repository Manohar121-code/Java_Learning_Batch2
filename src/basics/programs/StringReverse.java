package basics.programs;

public class StringReverse {
	public static void main(String[] args) {
		String s = "java";
		
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char charAt = s.charAt(i);
			rev = rev + charAt;
		}
		System.out.println("reverse - "+ rev);
	}
}
