package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		for (int number = 1; number <= 100; number++) {
			if (number % 3 == 0) {
				System.out.println("Fizz");
			} else if (number % 5 == 0) {
				System.out.println("Buzz");
			} else if (number % 3 == 0 && number % 5 == 0);
				System.out.println("FizzBuzz");
		}
		
		String[] programs = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		
		for (String program: programs) {
			if (program == "Java") {
				System.out.println("現在学習中の言語はJavaです。");
				continue;
			} else if (program == "HTML") {
				System.out.println("HTMLはプログラミング言語ではありません。");
				break;
		}
			System.out.println(program);
	}
	}
}
