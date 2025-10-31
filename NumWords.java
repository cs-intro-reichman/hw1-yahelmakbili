// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		// get input
		int num = Integer.parseInt(args[0]);
		// calculates ones
		int ones = (num % 10);
		// calculates tens
		int tens = (num / 10);
		// calculates hundreds
		int hundreds = (num / 100);
		// print the answer
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
