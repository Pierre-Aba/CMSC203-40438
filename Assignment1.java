/*
 * Class: CMSC203 
 * Instructor: Professor Grinberg
 * Description: The assignment1 class allows a user to guess input their details and guess colors, and total the correct # of color guesses
 * Due: 06/19/2023
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here:Pierre Aba
*/
import java.util.Random;
import java.util.Scanner;
class Assignment1 {
	public static void main(String[] args) {
		System.out.print("Enter your name please: ");
		Scanner sc = new Scanner(System.in);
		String studentName = sc.nextLine();
		
		System.out.print("Please enter your MC M-number: ");
		String studentMCID = sc.nextLine();
		
		System.out.print("Describe yourself please: ");
		String studentDescription = sc.nextLine();
		System.out.print("Due Date is: ");
		String date = sc.nextLine();
		
		System.out.print("CMSC203 Assignment1: Test your ESP skills!\n");
		
		final int TOTAL_ROUNDS = 10;
		int round = 1;
		int correctGuesses = 0;
		do {
			System.out.println("\nRound "+round);
			round++;
			System.out.println("I am thinking of a color.\nIs it Red(enter 1), Green(enter 2), Blue(enter 3), Orange(enter 4), or Yellow?(enter 5)\nEnter your guess here:");
			Random randomNum = new Random();
			int num= randomNum.nextInt(5)+1;
			int guess = sc.nextInt();
			if(guess == num)
				{System.out.println("You guessed correctly!");correctGuesses++;}
			else
				{System.out.println("You guessed wrong!");}
		
			switch(num)
			{
			case 1: System.out.print("I was thinking Red!\n");
			break;
			case 2: System.out.print("I was thinking Green!\n");
			break;
			case 3: System.out.print("I was thinking Blue!\n");
			break;
			case 4: System.out.print("I was thinking Orange!\n");
			break;
			case 5: System.out.print("I was thinking Yellow!\n");
			break;
			}
			
		}while(round<=TOTAL_ROUNDS);
		System.out.print("Game over!\n\nYou guessed " +correctGuesses+" out of 10 colors correcttly.\nUsername: "+studentName+"\nStudent MC M#: M"+studentMCID+"\nUser description: "+studentDescription);
		System.out.print("\nDate: "+date);
		
		
	}

}
