/*
Theodore Miller
CS142 - Chris Denzler
Assignment 5
This program play a guessing game with the user
A random number is assigned between 1 and a given maximum,
then the user guesses by entering an integer.
Each time the user enters, the program indicates whether the guess is too low or too high,
until the correct number is guessed. The program also tracks and reports how many guesses are made.
*/

import java.util.*; // for scanner

public class GuessingGame {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        // assign a random number to be the correct number
        int correctNumber = assignNumber(50);

        // initialize a guess variable
        int guess = -1;
        int guessCount = 0;

        do {
            // prompt for next guess
            System.out.print("Your guess: ");

            guess = console.nextInt();

            // evaluate guess
            System.out.println(evaluateGuess(guess, correctNumber));
            guessCount++;
        } while (guess != correctNumber);

        System.out.println("You guessed " + guessCount + " times.");
    }

    // following method determines if guess is too low/high/correct
    public static String evaluateGuess(int guess, int correctNumber){
        if (guess < correctNumber){
            return "Too low, guess higher";
        } else if (guess > correctNumber){
            return "Too high, guess lower";
        }
        return "Correct!";
    }

    // following method returns a random number between 0 and a given argument
    // also tells user to guess between 0 and int max
    public static int assignNumber(int max){
        int correctNumber = (int) Math.floor(Math.random() * max);
        // prompt user for guess
        System.out.println("Guess a number between 0 and " + max);
        return correctNumber;
    }
}
