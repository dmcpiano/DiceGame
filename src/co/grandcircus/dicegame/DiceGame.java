

package co.grandcircus.dicegame;

import java.util.Scanner;
import java.util.Random;

public class DiceGame {

		public static void main (String[] args) {
			
			Scanner scnr = new Scanner(System.in);
			
			System.out.println("Welcome to Grand Circus Casino! ");
			System.out.println("Roll the die? y/n");
			String userChoice = scnr.next();
		
		do {
			System.out.println("Enter the number of sides for each dice. ");
			int die1 = scnr.nextInt();
			int die2 = scnr.nextInt();
			generateRandomDieRoll(die1, die2);	
			System.out.println("Roll again? y/n");
			userChoice = scnr.next();
			
			if (userChoice.equals("n")) {
				
				System.out.println("Goodbye! ");
				
			}
				
		} while (userChoice.equalsIgnoreCase("y")); 
		
	} 		
	
	
		public static int generateRandomDieRoll(int die1, int die2) {
			
			Scanner scnr = new Scanner(System.in);
			Random rand = new Random();
			
			for (int i = 1; i <= die1 && i <=die2; i++); 
			
			die1 = (int) (Math.abs(rand.nextInt(die1)) + 1);
			die2 = (int) (Math.abs(rand.nextInt(die2)) + 1);
			System.out.println(die1 + "\n" + die2);
	
				
				return die1 + die2;
				
		} 
		
		public static void askAgain(String userPick) {
			
			Scanner scnr = new Scanner(System.in);
			
			System.out.println("Roll again? y/n");
			userPick = scnr.next();
			
		
		}
			
}
	
			

