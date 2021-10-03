package week1.day1;

public class PrimeNumber {

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 
	 * 
	 * 1) declaration of variables and initialization with a value
	 * 2) boolean for condition pass or fail
     * 3) for loop for iteration 
     * 4) operators like / and %, dividing with quotient and dividing with remaider
     * 5) break statement used to come out of iteration
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an int Input and assign a value 13
		int input = 13;

		// Declare a boolean variable flag as false
		boolean flag = false;
		
		// Iterate from 2 to half of the input
		for (int i = 2; i <= (input/2); i++) {

			// Divide the input with each for loop variable and check the remainder
			int remainder = input % i;
			
			System.out.println("remainder = " +remainder);

			// Set the flag as true when there is no remainder
			// break the iterator
			if (remainder == 0) {
				flag = true;
			}
			break;
		}
		// Check the flag (Provide a condition)
		if (flag == false) {

			// Print 'Prime' when the condition matches
			System.out.println("Number " + input + " is a Prime Number");
		} else {
			// Print 'Not a Prime' when the condition doesn't match
			System.out.println("Number " + input + " is NOT a Pime Number");
		}
	}
}