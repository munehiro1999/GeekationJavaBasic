package basicSyntax;

public class GeekationIntroduction {

	public static void greeting(String intro, int age, double height) {
		System.out.println(intro);
		System.out.println("年は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");
		
	}
	
	public static void specialSkils(int num1, int num2) {
		
		if (num1 < 1 || num2 < 1) {
			System.out.println("num1とnum2は0より大きい値にしてください。");
			return;
		} 
		
		if (num1 >= num2) {
			System.out.println("num2はnum1より大きい値にしてください。");
			return;
		}
		
		for (int count = num1; count <= num2; count++) {
			if (count % 3 == 0 && count % 5 == 0) {
				System.out.println(count + "3の倍数かつ5の倍数です。");
				continue;
			} 
			
			if (count % 3 == 0) {
				System.out.println(count + "3の倍数です。");
				continue;
			}
			
			if (count % 5 == 0) {
				System.out.println(count + "5の倍数です。");
			}
			
			System.out.println(count);
		}
	}	
}
