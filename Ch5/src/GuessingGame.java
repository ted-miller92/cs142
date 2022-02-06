/*
Theodore Miller
CS142 - Chris Denzler
Assignment 5
This program play a guessing game with the user
A random number is assigned between 1 and 100,
then the user guesses by entering an integer.
Each time the user enters, the program indicates whether the guess is too low or too high,
until the correct number is guessed
*/


import java.util.*; // for scanner

public class GuessingGame {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int correctNumber = assignNumber(100);

        System.out.println("Guess a number between 0 and 100");

        // initialize a guess variable
        int guess = -1;

        do {
            System.out.print("Your guess: ");
            guess = console.nextInt();
            System.out.println(evaluateGuess(guess, correctNumber));
        } while (guess != correctNumber);

        System.out.println();
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
    public static int assignNumber(int max){
        int correctNumber = (int) Math.floor(Math.random() * max);
        return correctNumber;
    }
}
