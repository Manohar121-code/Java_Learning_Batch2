package basics.string;

public class StringEx {
	public static void main(String[] args) {
		String s = "java is a programming language";
		
		int length = s.length();
		System.out.println("length - "+length);
		
		char ch = s.charAt(2);
		System.out.println("char at 2nd index - "+ch);
		
		int index = s.indexOf('a');
		System.out.println("first occurance of a - "+ index);
		
		int indexOf = s.indexOf('a', 2);
		System.out.println("second occurance of a - "+ indexOf);
		
		int indexOf2 = s.indexOf('a', indexOf + 1);
		System.out.println("third occurance of a - "+ indexOf2);
		
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println("last occurance of a - "+ lastIndexOf);
		
		String subStr1 = s.substring(5);
		System.out.println(subStr1);
		
		String substring2 = s.substring(5, 11);
		System.out.println(substring2);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);
		
		String s2 = " java is ";
		String trim = s2.trim();
		System.out.println(trim);
	}
}
