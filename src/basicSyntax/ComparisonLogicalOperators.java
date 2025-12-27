package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 30;
		int b = 10;
	
		System.out.println(a > b);
		
		boolean isSunny = true;
		boolean isWarm = true;
		
		boolean result = isSunny && isWarm;
		
		System.out.println(result);
		
		int x = 20;
		int y = 40;
		
		boolean orResult = (x >= 0 && y % 2 == 0);
		
		System.out.println(orResult);
		
		int w = 10;
		int z = 20;
		
		boolean hasPermission = !(x == y);
		
		System.out.println(hasPermission);
		}

}
