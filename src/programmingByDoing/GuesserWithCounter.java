package programmingByDoing;

import java.util.Random;
import java.util.Scanner;

public class GuesserWithCounter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int chosenNumber = 1 + r.nextInt(10);

		System.out.println(
				"I have chosen a number between 1 and 10. Try to guess it. You only get 7 chances so choose wisely!");

		int guessedNumber = input.nextInt();
		int count = 0;
		count++;

		do {
			System.out.println("That is incorrect! Guess again! Chances used: " + count);
			guessedNumber = input.nextInt();
			count++;
		} while (guessedNumber != chosenNumber && count <= 7);

		if (guessedNumber == chosenNumber) {
			System.out.println("That's right good job!");
			System.out.println("It only took you " + count + " guesses");
		}
		if (guessedNumber != chosenNumber || count >= 7) {
			System.out.println("You have used up all your chances :( try again later!");
		}
	}
}
