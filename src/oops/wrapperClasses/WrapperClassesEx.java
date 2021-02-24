package oops.wrapperClasses;

public class WrapperClassesEx {
	public static void main(String[] args) {
		int i = 10;
		Integer iObj = new Integer(i); //boxing
		
		int intValue = iObj.intValue(); //unboxing
		System.out.println(i);
		System.out.println(intValue);
		System.out.println("-----------------");
		
		long l = 101010;
		Long lObj = new Long(l);
		long longValue = lObj.longValue();
		
		System.out.println("-------------");
		char ch = '@';
		Character cObj = new Character(ch);
		char charValue = cObj.charValue();
		
		System.out.println("-----------------");
		
		double d = 78.23;
		Double dObj = new Double(d);
		double doubleValue = dObj.doubleValue();
		
		System.out.println("----------------------");
		
		boolean b = true;
		Boolean bObj = new Boolean(b);
		boolean booleanValue = bObj.booleanValue();
		
	}
}
