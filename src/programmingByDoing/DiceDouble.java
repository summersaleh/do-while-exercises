package programmingByDoing;

import java.util.Random;

public class DiceDouble {

	public static void main(String[] args) {

//		Importing the Java Utility to be able to generate random numbers
		Random r = new Random();
//		declaring the roll variables 
		int roll1;
		int roll2;
		
//		Not including the game start text in the loop so it doesn't repeat
System.out.println("HERE COMES THE DICE!");

do {
//	giving the variables the value of a random number between 1-6 when "rolled"
	roll1 = 1 + r.nextInt(6);
	roll2 = 1 + r.nextInt(6);
	System.out.println("Roll #1: " + roll1);
	System.out.println("Roll #2: " + roll2);
	System.out.println("The total is " + (roll1 + roll2));
} while (roll1 != roll2);
		 System.out.println("DOUBLES!");	
	}

}
