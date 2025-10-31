// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		// get input
		int num = Integer.parseInt(args[0]);
		// calculates ones
		int ones = (num % 10);
		int num1 = (num / 10);
		// calculates tens
		int tens = (num1 % 10);
		int num2 = (num1 / 10);
		// calculates hundreds
		int hundreds = num2;
		// print the answer
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
