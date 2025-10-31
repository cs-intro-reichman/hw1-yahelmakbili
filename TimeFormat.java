public class TimeFormat {
	public static void main(String[] args) {

		// input like "18:45"
		String input = args[0];

		// parse hours and minutes from the string
		int hours24 = Integer.parseInt("" + input.charAt(0) + input.charAt(1));
		int mins = Integer.parseInt("" + input.charAt(3) + input.charAt(4));

		// decide AM/PM (suffix)
		String suffix;
		if (hours24 >= 12) {
			suffix = "PM";
		} else {
			suffix = "AM";
		}

		// convert 24-hour clock → 12-hour clock
		int hours12;
		if (hours24 == 0) {
			// 00:xx -> 0:xx AM
			hours12 = 0;
		} else if (hours24 > 12) {
			// 13..23 -> 1..11 PM
			hours12 = hours24 - 12;
		} else {
			// 01..12 stays the same
			hours12 = hours24;
		}

		// hourStr: NO leading zero
		String hourStr = "" + hours12;

		// minStr: always 2 digits
		String minStr;
		if (mins < 10) {
			minStr = "0" + mins;
		} else {
			minStr = "" + mins;
		}

		// FINAL OUTPUT (always prints once)
		System.out.println(hourStr + ":" + minStr + " " + suffix);
	}
}