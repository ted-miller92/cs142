/*
SumOfCubes.java
Theodore Miller
Assignment 4
CS142 - Chris Denzler
This program finds all numbers between 100 and 999
that are equal to the sum of the cubes of their respective digits
 */

public class SumOfCubes {

    public static void main(String[] args){
        // loop through each number between 100 and 999
        for(int i = 100; i <= 999; i ++) {

            // break up number into composite digits
            int digit1 = i % 10;
            int digit10 = i % 100 / 10;
            int digit100 = i % 1000 / 100;

            // find sum of cubed digits
            int sum = sumOfCubedDigits(digit1, digit10, digit100);

            if (sum == i) {
                System.out.println(i + " = " + digit1 + "^3 + " + digit10 + "^3 + " + digit100 + "^3");
            }
        }
    }
    // following method returns the sum of the cubed digits of a number
    // takes three args, each representing a digit
    public static int sumOfCubedDigits(int i, int j, int k){
        int sumOfCubes = (int)( Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3) );
        return sumOfCubes;
    }
}
