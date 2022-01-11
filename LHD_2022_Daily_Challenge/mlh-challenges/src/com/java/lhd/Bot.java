package com.java.lhd;

import java.security.SecureRandom;
import java.util.Scanner;

public class Bot {

	public static void main(String[] args) {
		int userScore = 0, machineScore = 0;
		try (Scanner sc = new Scanner(System.in)) {
			String input = "Y";
			while(input.equalsIgnoreCase("Y")) {
				System.out.println("Press 1 to choose Rock\n"
						+ "Press 2 to choose Paper\n"
						+ "Press 3 to choose Scissor\n");
				int userC = sc.nextInt();
				
				String[] arr={"Rock", "Paper", "Scissor"};
		      	SecureRandom r=new SecureRandom();        
		      	int randomNumber=r.nextInt(arr.length);
		      	System.out.println("I chose " + arr[randomNumber]);
				
		      	if(randomNumber == 0) {
		      		if(userC == 2) {
		      			System.out.println("You won this round!");
		      			userScore++;
		      		}
		      		else if(userC == 3) {
		      			System.out.println("I won this round!");
		      			machineScore++;
		      		}
		      		else {
		      			System.out.println("Draw!! No Scores this round!");
		      		}
		      	}
		      	else if(randomNumber == 1) {
		      		if(userC == 3) {
		      			System.out.println("You won this round!");
		      			userScore++;
		      		}
		      		else if(userC == 1) {
		      			System.out.println("I won this round!");
		      			machineScore++;
		      		}
		      		else {
		      			System.out.println("Draw!! No Scores this round!");
		      		}
		      	}
		      	else {
		      		if(userC == 1) {
		      			System.out.println("You won this round!");
		      			userScore++;
		      		}
		      		else if(userC == 2) {
		      			System.out.println("I won this round!");
		      			machineScore++;
		      		}
		      		else {
		      			System.out.println("Draw!! No Scores this round!");
		      		}
		      	}
		      	System.out.println("So, at the end of this round...");
				System.out.println("Your score is " + userScore
						+ "\n and the scoreboard stands " + userScore
						+ " - " + machineScore);
				System.out.println("Press Y to continue or "
						+ "any other key to end the game!");
				input = sc.next();
			}
			System.out.println("Thanks for playing :)");
		}

	}

}
