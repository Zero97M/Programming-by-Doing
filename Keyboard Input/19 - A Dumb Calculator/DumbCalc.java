import java.util.Scanner;

public class DumbCalc
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int a, b, c;
		
		System.out.print("first: ");
		a = keyboard.nextInt();
		
		System.out.print("second: ");
		b = keyboard.nextInt();

		System.out.print("third: ");
		c = keyboard.nextInt();

		System.out.println(" ");
		System.out.println("( " + a + " + " + b + " + " + c + " ) / 2 is... " + ((a+b+c)/2));
	}
}
