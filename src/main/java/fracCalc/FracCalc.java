/**
 * @author Mr. Rasmussen
 */

package fracCalc;

import java.util.*;

public class FracCalc {

	public static int firstSpace;
	public static String num1;
	public static String num2;
	public static String operator;
	public static int underscore;
	public static int fractionBar;
	public static String whole;
	public static String numerator;
	public static String denominator;

	public static void main(String[] args) {
		System.out.println("Welcome to the fraction calculator");
		System.out.println();

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter an equation: ");
		String expression = userInput.next();
		/*
		 * gather the user's string input for what expression they would like the
		 * calculator to compute
		 */

		produceAnswer(expression);
		
		// System.out.println("Whole:" + whole(expression) + " numerator:" + numerator(expression) + " denominator:" + denominator(expression)); 

		// TODO: Read the input from the user and call produceAnswer with an equation

	}

	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION. This function will be used to
	// test your code
	// This function takes a String 'input' and produces the result
	//
	/*
	 * input is a fraction string that needs to be evaluated. For your program, this
	 * will be the user input.
	 */
	// e.g. input ==> "1/2 + 3/4"
	//
	// The function should return the result of the fraction after it has been
	// calculated
	// e.g. return ==> "1_1/4"
	public static String produceAnswer(String input) {

		firstSpace = input.indexOf(" ");
		// find the index of the space between the first number and the operator

		num1 = input.substring(0, firstSpace);
		operator = input.substring((firstSpace + 1), (firstSpace + 2));
		num2 = input.substring(firstSpace + 3);
		
		underscore = num2.indexOf("_");
		fractionBar = num2.indexOf("/");

		return "whole:" + whole(num2) + " numerator:" + numerator(num2) + " denominator:" + denominator(num2); 

		// TODO: Implement this function to produce the solution to the input
	}
	
	public static String whole(String num2) {
		underscore = num2.indexOf("_");
		fractionBar = num2.indexOf("/");

		if (underscore > 0 && fractionBar > 0) {
			whole = num2.substring(0, underscore);
		} else if (underscore == -1 && fractionBar > 0) {
			whole = "0"; 
		} else if (underscore == -1 && fractionBar == -1){
			whole = num2;
		}
		return whole; 
	}
	
	public static String numerator(String num2) {
			if (fractionBar > 0) {
				numerator = num2.substring((underscore + 1), fractionBar);  
			} else {
				numerator = "0"; 
			}
			return numerator;
		}
	
	public static String denominator(String num2) {	
		if (fractionBar > 0) {
			denominator = num2.substring((fractionBar + 1));
		}
		else if (fractionBar == -1) {
			denominator = "1"; 
		}
		return denominator; 
	}
	
}

