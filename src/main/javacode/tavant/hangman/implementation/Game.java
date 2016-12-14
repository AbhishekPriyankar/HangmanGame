package main.javacode.tavant.hangman.implementation;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {

		Boolean exit = Boolean.FALSE;
		Boolean finish = Boolean.FALSE;
		Scanner inp = new Scanner(System.in);
		Character userInput;
		while (!finish) {
			Integer lives = 0;
			exit = Boolean.FALSE;
			System.out.println("H A N G M A N    G A M E");
			Dictionary dictionary = new Dictionary();
			WordInUpperCase wordInUpperCase = new WordInUpperCase(dictionary.getRandomWord());
			IncompleteWord incompleteWord = new IncompleteWord(wordInUpperCase);
			while (!exit) {
				System.out.println("Guess the Word");
				System.out.println("your Word status : " + incompleteWord.getWordWithDashes());
				userInput = inp.next().charAt(0);
				if (incompleteWord.isPresent(userInput)) {
					if (incompleteWord.isAlreadyInserted(userInput)) {
						System.out.println("You have already inserted that word");
					} else {
						incompleteWord.replaceAllOccurrences(userInput);
						System.out.println("Correct Guess");
					}
				} else {
					lives++;
					if (lives == 5) {
						exit = Boolean.TRUE;
						System.out.println("You Lose");
					}
				}
				if (!incompleteWord.isDashPresent()) {
					System.out.println("The word : " + incompleteWord.getWordWithDashes());
					System.out.println("You win");
					System.out.println("Your word guessing Accuracy : "+(5-lives)*100/5+" %");
					exit = Boolean.TRUE;
				}
			}
			System.out.println("Do you want to play again ? Y - yes | other key - quit");
			finish = inp.next().equalsIgnoreCase("Y") == true ? Boolean.FALSE : Boolean.TRUE;
		}
		inp.close();
	}
}
