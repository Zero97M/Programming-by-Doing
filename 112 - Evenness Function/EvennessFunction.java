public class EvennessFunction{
	public static void main (String[] args) {
		for (int i = 1; i <= 20; i++){
			
			System.out.print(i + " ");
			
			if (isEven(i) == true)
				System.out.print("<");
			
			if (isDivisibleBy3(i) == true)
				System.out.print("=");
			
			System.out.println();
		}
	}
	
	public static boolean isEven (int n){
		boolean a;
		if (n%2 == 0)
			a = true;
		else a = false;
		return a;
	}
	
	public static boolean isDivisibleBy3 (int n) {
		boolean a;
		if (n%3 == 0)
			a = true;
		else a = false;
		return a;
	}
}
