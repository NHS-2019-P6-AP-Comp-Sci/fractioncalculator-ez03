/**
 * @author Mr. Rasmussen
 */

package fracCalc;

import java.util.*; 

public class FracCalc {

    public static void main(String[] args)
    {
    	System.out.println("Welcome to the fraction calculator");
    	System.out.println(); 
    	
    	Scanner userInput = new Scanner(System.in); 
    	System.out.println("Enter an equation: "); 
    	String expression = userInput.next(); 
    	/* gather the user's string input for what expression they would like 
    	the calculator to compute */
    	
    	produceAnswer(expression); 
    	
        // TODO: Read the input from the user and call produceAnswer with an equation

    }

    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    /* input is a fraction string that needs to be evaluated.  For your program, 
    this will be the user input. */
    //      e.g. input ==> "1/2 + 3/4"
    //
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    {
    	int firstSpace = input.indexOf(" "); 
    	// find the index of the space between the first number and the operator
    	
    	String num1 = input.substring(0, firstSpace); 
    	String operator = input.substring((firstSpace + 1), (firstSpace + 2)); 
    	String num2 = input.substring(firstSpace + 3); 
    	/* Parse the user's string input into three parts: the first number, 
    	 * the operator, and the second number
    	 */
    	
    	System.out.println(num2);
    	// print the parsed second number that the user put as their input

        return num2;
     // TODO: Implement this function to produce the solution to the input
    }

    // TODO: Fill in the space below with any helper methods that you think you will need

}
