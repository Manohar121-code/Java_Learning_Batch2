package basics.incAndDec;

public class IncAndDecEx {
	public static void main(String[] args) {
		int i = 10;
		i++;
		System.out.println(i); // 11
		i--;
		System.out.println(i);
		System.out.println("-----------------");
		int j = 5;
		int k = ++j;
		System.out.println(k);
		System.out.println(j); //6
		
		System.out.println("------------");
		int n = j--;
		System.out.println(n);
		System.out.println(j);
		System.out.println("---------------------------");
		
		int h = 20;
		System.out.println(h++);
		System.out.println(h); //h = 21
		
		System.out.println(--h);
		System.out.println(h);
		System.out.println("-------------------");
		
		int g = 10;
		if (g++ == 10) {
			System.out.println("if executed and g value - "+ g);
		}
		//g - 11
		if (12 == ++g) {
			System.out.println("if executed and g value - "+ g);
		}
		System.out.println("-------------------");
		
		int y = 10;
		if (y++ == 10 && --y == 10 && --y == 9 && y-- == 9) {// y =8
			System.out.println("if executed and y value - "+ y);
		}
		System.out.println("--------------------------");
		int r = 10;
		r++;
		System.out.println(r);// r = 11
		
		r = r + 2; // r = 13
		r += 2; // r = 15
		System.out.println(r); // r = 15
				
		r -= 5;
		System.out.println(r); // r = 10
		
		r *= 5;
		System.out.println(r); // r = 50
		
		r /= 2;
		System.out.println(r); // r = 25
	}
}
