package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 30;
		
		resultSum(add(number1, number2));
		resultSum(subtract(number1, number2));
		resultSum(multilply(number1, number2));
		resultSum(divide(number1, number2));
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multilply(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int divide(int num1, int num2) {
		return num1 % num2;
	}
	
	public static void resultSum(int result) {
		System.out.println("計算結果は" + result + "です。");
	}
}
