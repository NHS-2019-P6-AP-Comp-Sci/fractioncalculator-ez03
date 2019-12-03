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
	public static int underscore2;
	public static int fractionBar2;
	public static int whole2;
	public static int numerator2;
	public static int denominator2;
	public static int underscore1;
	public static int fractionBar1;
	public static int whole1;
	public static int numerator1;
	public static int denominator1;
	public static String result;
	public static int newNumerator1;
	public static int newNumerator2;
	public static int answer;
	public static int numerator;
	public static int denominator;

	public static void main(String[] args) {
		System.out.println("Welcome to the fraction calculator.");
		System.out.println();

		Scanner userInput = new Scanner(System.in);

		

//		System.out.println("Enter an equation: ");
//		String expression = userInput.nextLine();
		String expression = "";
		while (!expression.equals("quit")) {
			System.out.println("Enter an equation: "); 
			expression = userInput.nextLine();
			produceAnswer(expression);
			
		}

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
		num1 = input.substring(0, firstSpace);
		operator = input.substring((firstSpace + 1), (firstSpace + 2));
		num2 = input.substring(firstSpace + 3);
		// Separate the equation entered into the operand and the two numbers
		
		underscore2 = num2.indexOf("_");
		fractionBar2 = num2.indexOf("/");
		// Determine position of fraction bar and underscore in the second number to determine parsing
		
		if (underscore2 > 0 && fractionBar2 > 0) {
			whole2 = Integer.parseInt(num2.substring(0, underscore2));
		} else if (underscore2 == -1 && fractionBar2 > 0) {
			whole2 = 0;
		} else {
			whole2 = Integer.parseInt(num2);
		}
		// Parse out the whole number of number 2 (if it exists) and convert to an integer
		
		if (fractionBar2 > 0) {
			numerator2 = Integer.parseInt(num2.substring((underscore2 + 1), fractionBar2));
		} else {
			numerator2 = 0;
		}
		// Parse out the numerator of number 2 and convert to an integer
		
		if (fractionBar2 > 0) {
			denominator2 = Integer.parseInt(num2.substring((fractionBar2 + 1)));
		} else {
			denominator2 = 1;
		}
		// Parse out the denominator of number 2 and convert to an integer
		
		underscore1 = num1.indexOf("_");
		fractionBar1 = num1.indexOf("/");
		// Determine placement of the underscore and fraction bar once again in the first number
		
		if (underscore1 > 0 && fractionBar1 > 0) {
			whole1 = Integer.parseInt(num1.substring(0, underscore1));
		} else if (underscore1 == -1 && fractionBar1 > 0) {
			whole1 = 0;
		} else {
			whole1 = Integer.parseInt(num1);
		}
		// Parse out whole number of number 1
		
		if (fractionBar1 > 0) {
			numerator1 = Integer.parseInt(num1.substring((underscore1 + 1), fractionBar1));
		} else {
			numerator1 = 0;
		}
		// Parse out numerator
		
		if (fractionBar1 > 0) {
			denominator1 = Integer.parseInt(num1.substring((fractionBar1 + 1)));
		} else {
			denominator1 = 1;
		}
		// Parse out denominator
				
		newNumerator1 = numerator1 + (Math.abs(whole1) * denominator1);
		newNumerator2 = numerator2 + (Math.abs(whole2) * denominator2);
		// Convert numerator into a usable form for an improper fraction
		
		if (whole1 < 0) {
			newNumerator1 *= -1; 
		}
		if (whole2 < 0) {
			newNumerator2 *= -1; 
		}
		// Multiply by -1 to account for negative fractions
		
		if (operator.equals("+")) {
			numerator = (newNumerator1 * denominator2) + (newNumerator2 * denominator1);
			denominator = denominator1 * denominator2;
		} else if (operator.equals("-")) {
			numerator = (newNumerator1 * denominator2) - (newNumerator2 * denominator1);
			denominator = denominator1 * denominator2;
		} else if (operator.equals("*")) {
			numerator = newNumerator1 * newNumerator2;
			denominator = denominator1 * denominator2;
		} else if (operator.contentEquals("/")) {
			numerator = denominator2 * newNumerator1;
			denominator = denominator1 * newNumerator2;
		} 
		// Perform operations as requested by the user
		return numerator + "/" + denominator; 
		// Return answer in the form of an improper fraction
	}
}