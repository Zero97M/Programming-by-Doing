import java.util.Scanner;

public class PrimeNumber{
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		int finalNumber;
		
		System.out.print("Enter the number to know how many prime numbers are there till that number: ");
		finalNumber = keyboard.nextInt();
		
		System.out.println("Here is the list of prime numbers till " + finalNumber);
		
		for(int i = 2; i <= finalNumber; i++){
			System.out.print(" " + i);
			if (isPrime(i) == true)
				System.out.print(" <");
			System.out.println();
		}
		
	}
	
	public static boolean isPrime ( int n ){
		boolean prime = true;
		for(int i = 2; i < n; i++){
			if (n % i == 0){
				prime = false;
				break;
			}
		}
		return prime;
	}
}
