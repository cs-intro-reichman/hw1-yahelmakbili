// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// get input limit
		int lim = Integer.parseInt(args[0]);
		// get 3 random numbers
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);
		// print first line
		System.out.println(a + " " + b + " " + c);
		// find max num
		int Max = Math.max(c, Math.max(a, b));
		// find min num
		int Min = Math.min(Math.min(a, b), c);
		// find middle num
		int Middle = ((a + b + c) - Min - Max);
		// print second line
		System.out.println(Max + " " + Middle + " " + Min);
	}
}
