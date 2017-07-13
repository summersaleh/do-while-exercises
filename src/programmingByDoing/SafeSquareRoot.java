package programmingByDoing;

import java.util.Scanner;

public class SafeSquareRoot {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("SQUARE ROOT \nEnter a number:");
		int chosenNumber = input.nextInt();
		
		while(chosenNumber < 0) {
				System.out.println("You can't take the square root of a negative number silly! \nTry Again:");
				chosenNumber = input.nextInt();
			}
		
		
		System.out.println("The square root of " + chosenNumber + " is: " + Math.sqrt(chosenNumber));
		
	}	
		
		
	}


