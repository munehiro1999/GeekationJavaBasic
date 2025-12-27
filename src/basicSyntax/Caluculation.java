package basicSyntax;

public class Caluculation {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = x + y;
		
		System.out.println("変数zの値は" + z + "です");
		
		double a = 5.25;
		
		a += 2.5;
		a *= 3.0;
		
		int intA = (int)a;
		int b = intA;
		b += 10;
		
		System.out.println("変数aの値は" + a + "です");
		System.out.println("変数の値は" + b + "です");
	}

}
