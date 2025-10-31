// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		// get 3 inputs
		double currentValue = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);

		// calculates pow (1+rate/100)
		double pow = (double) Math.pow((1 + (rate / 100)), n);
		// calculate future value
		double FutureValue = (currentValue * pow);

		// print answer
		System.out.println(
				"After " + n + " years," + " $" + (int) currentValue + " saved at " + rate + "% " + "will yield $"
						+ (int) FutureValue);

	}
}