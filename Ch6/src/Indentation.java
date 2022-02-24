/*
 * Theodore Miller
 * CS142 - Winter 2022 - Chris Denzler
 * Assignment 6
 * This program prompts the user for a file name, 
 * then applies proper indentation based on the presence of curly braces.
 * The output is then written to a file 
 */

import java.io.*;
import java.util.*;

public class Indentation {
	// constant for size of one indentation
	public static final int INDENT_SIZE = 4;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// Prompt for file name
		Scanner console = new Scanner(System.in);
		Scanner input = getInput(console);
		String fileName = "FixedFile.java";
		
		PrintStream output = new PrintStream(new File(fileName));
		int indents = 0;
		
		while (input.hasNextLine()) {
			String text = input.nextLine();
			output.println(text);
			if (text.contains("{")) {
				indents ++;
			} else if (text.contains("}")) {				
				indents --;
			}
			for (int i = 0; i < indents * INDENT_SIZE; i ++) {
				output.print(" ");
			}
		}
		System.out.println("New file written to " + fileName);
	}
	
	// following method gets input from user and checks that the file exists/is readable
	public static Scanner getInput(Scanner console) throws FileNotFoundException {
		System.out.print("Input file name: ");
		File f = new File(console.nextLine());
		while (!f.canRead()) {
			System.out.println("File not found. Please try again.");
			System.out.print("Input file name: ");
			f = new File(console.nextLine());
		}
		// after confirming that f is a readable file
		return new Scanner(f);
	}
}
