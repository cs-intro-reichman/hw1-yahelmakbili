// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// get input of 3 names
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		// get input of the total bill
		int bill = Integer.parseInt(args[3]);
		// divide and round the bill
		double share = (double) bill / 3;
		double roundedShare = Math.ceil(share);
		// print results in reverse
		System.out
				.println(
						"Dear " + name3 + ", " + name2 + "," + " " + "and " + name1 + ": pay" + " " + roundedShare + " "
								+ "Shekels each.");
	}
}
