package programmingByDoing;

import java.util.Scanner;

public class DoWhileSwimming {

	public static void main(String[] args) throws Exception {

	Scanner input = new Scanner(System.in);
	
	String swimmer1 = "GALLENT";
	String swimmer2 = "GOOFUS";
	
	double minimumTemp = 79.0; //degrees Fahrenheit
	double currentTemp;
	double savedTemp;
	int swimTime;
	
	System.out.println("What is the current water temperature?");
	currentTemp = input.nextDouble();
	savedTemp = currentTemp; //saves a copy of this value so we can get it back later.
	
	System.out.println("\nOkay, so the current water temperature is " + currentTemp + "F.");
	System.out.println(swimmer1 + " approaches the lake....");
	
	swimTime = 0;
	
	while (currentTemp >= minimumTemp) {
		System.out.println("\t" + swimmer1 + " swims for a bit.");
		swimTime++;
		System.out.println(" Swim time: " + swimTime + " min." );
		Thread.sleep(600); //pauses for 600 miliseconds
		currentTemp -= 0.5; // subtracts 1/2 a degree from the water temp
		System.out.println("\tThe current water temperature is now " + currentTemp + "F.");
	}
	
	System.out.println(swimmer1 + " stops swimming. Total swim time: " + swimTime + " min.");
	
	currentTemp = savedTemp; //restores original water temp
	
	System.out.println("\nOkay, so the current water temperature is " + currentTemp + "F.");
	System.out.println(swimmer2 + " approaches the lake...");
	
	swimTime = 0;
	do {
		System.out.println("\t" + swimmer2 + " swims for a bit." );
		swimTime++;
		System.out.println(" Swim time: " + swimTime + " min.");
		Thread.sleep(600);
		currentTemp -= 0.5;
		System.out.println("\tThe current water temperature is now " + currentTemp + "F.");
	} while (currentTemp >= minimumTemp);
	
	System.out.println(swimmer2 + " stops swimming. Total swim time: " + swimTime);
	}

}
