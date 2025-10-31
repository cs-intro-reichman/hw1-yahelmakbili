public class TimeFormat {
	public static void main(String[] args) {

		// get input
		String input = args[0];

		// get hours and minutes
		int hours24 = Integer.parseInt("" + input.charAt(0) + input.charAt(1));
		int mins = Integer.parseInt("" + input.charAt(3) + input.charAt(4));

		// suffix
		String suffix;
		if (hours24 >= 12) {
			suffix = "PM";
		} else {
			suffix = "AM";
		}

		// convert
		int hours12;
		if (hours24 == 0) {
			hours12 = 12;
		} else if (hours24 > 12) {
			hours12 = hours24 - 12;
		} else {
			hours12 = hours24;
		}
		// zero hour
		String hourStr;
		if (hours12 < 10) {
			hourStr = "0" + hours12;
		} else {
			hourStr = "" + hours12;
		}

		// zero minutes
		String minStr;
		if (mins < 10) {
			minStr = "0" + mins;
		} else {
			minStr = "" + mins;
		}

		// הדפסה סופית
		System.out.println(hourStr + ":" + minStr + " " + suffix);
	}
}
