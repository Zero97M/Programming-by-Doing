import java.util.Scanner;
import java.util.Random;

public class Dice{
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random randomDiceNumber = new Random();
		
		System.out.println("HERE COMES THE DICE!");
		System.out.println();
		
		int roll1 = randomDiceNumber.nextInt(6) + 1;
		System.out.println("Roll #1: " + roll1);
		int roll2 = randomDiceNumber.nextInt(6) + 1;
		System.out.println("Roll #2: " + roll2);
		
		System.out.println("The total is " +  (roll1 + roll2) + "!");
	}
}
