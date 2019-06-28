

package co.grandcircus.dicegame;

import java.util.Scanner;
import java.util.Random;

public class DiceGame {

		public static void main (String[] args) {
			
			Scanner scnr = new Scanner(System.in);
			
			System.out.println("Welcome to Grand Circus Casino! ");
			System.out.println("Roll the die? y/n");
			String userChoice = scnr.next();
			
		if (userChoice.equalsIgnoreCase("y")) {
			
			generateRandomDieRoll();
	
		} else {
			
			System.out.println("Okay, maybe next time! ");
			
		}
	}
		
		public static void generateRandomDieRoll() {
			
			Scanner scnr = new Scanner(System.in);
			Random rand = new Random();
			
			System.out.println("Enter the number of sides on each die. ");
			int numSides1 = scnr.nextInt();
			int numSides2 = scnr.nextInt();
			
			int firstDie = (int) (Math.abs(rand.nextInt(numSides1)));
			int secondDie = (int) (Math.abs(rand.nextInt(numSides2)));
			System.out.println(firstDie + "\n" + secondDie);
			int sum = firstDie + secondDie;
			
			System.out.println("Want to roll again? ");
			String userChoice = scnr.next();
	
		if (userChoice.equals("y")) {
				
				generateRandomDieRoll();
				
		} else {
				
			System.out.println("Goodbye. ");
				
		}
	}
			
		
}
