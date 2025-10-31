public class TimeFormat {
	public static void main(String[] args) {
		// get input
		String input = args[0];

		// find the min and hours
		int hours = Integer.parseInt("" + input.charAt(0) + input.charAt(1));
		int minutes = Integer.parseInt("" + input.charAt(3) + input.charAt(4));

		// find AM/PM
		String suffix;
		if (hours >= 12) {
			suffix = "PM";
		} else {
			suffix = "AM";
		}

		// convert hours
		int displayHour;
		if (hours == 0) {
			displayHour = 12;
		} else if (hours > 12) {
			displayHour = hours - 12;
		} else {
			displayHour = hours;
		}

		// zero hours
		String hourStr;
		if (displayHour < 10) {
			hourStr = "0" + displayHour;
		} else {
			hourStr = "" + displayHour;
		}

		// zero minutes
		String minuteStr;
		if (minutes < 10) {
			minuteStr = "0" + minutes;
		} else {
			minuteStr = "" + minutes;
		}

		// final print
		System.out.println(hourStr + ":" + minuteStr + " " + suffix);
	}
}
