public class TimeFormat {
	public static void main(String[] args) {

		// read input "HH:MM"
		String input = args[0];

		// parse hours and minutes from the string
		int hours24 = Integer.parseInt("" + input.charAt(0) + input.charAt(1));
		int mins = Integer.parseInt("" + input.charAt(3) + input.charAt(4));

		// decide AM / PM
		String suffix;
		if (hours24 >= 12) {
			suffix = "PM";
		} else {
			suffix = "AM";
		}

		// convert to 12-hour clock
		int hours12;
		if (hours24 == 0) {
			// 00:xx -> 12:xx AM
			hours12 = 12;
		} else if (hours24 > 12) {
			// 13..23 -> (hour-12):xx PM
			hours12 = hours24 - 12;
		} else {
			// 01..12 stays the same
			hours12 = hours24;
		}

		// make sure hour is 2 digits
		String hourStr;
		if (hours12 < 10) {
			hourStr = "0" + hours12;
		} else {
			hourStr = "" + hours12;
		}

		// make sure minutes are 2 digits
		String minStr;
		if (mins < 10) {
			minStr = "0" + mins;
		} else {
			minStr = "" + mins;
		}

		// FINAL OUTPUT (always prints!)
		System.out.println(hourStr + ":" + minStr + " " + suffix);
	}
}
