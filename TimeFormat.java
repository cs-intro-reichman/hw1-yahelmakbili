public class TimeFormat {
	public static void main(String[] args) {
		// input comes as "hh:mm"
		String input = args[0];

		// 1. take hours and minutes from the string
		int hours24 = Integer.parseInt("" + input.charAt(0) + input.charAt(1));
		int mins = Integer.parseInt("" + input.charAt(3) + input.charAt(4));

		// 2. decide AM or PM from the 24h hour
		String suffix;
		if (hours24 >= 12) {
			suffix = "PM";
		} else {
			suffix = "AM";
		}

		// 3. convert 24h -> 12h display hour
		int hours12;

		if (hours24 == 0) {
			// 00:xx -> 0:xx AM
			hours12 = 0;
		} else if (hours24 > 12) {
			// 13..23 -> 1..11 PM
			hours12 = hours24 - 12;
		} else {
			// 01..12 -> stays same
			hours12 = hours24;
		}

		// 4. build hour as string WITHOUT leading zero (this was failing tests like
		// 13:13 -> 01:13 PM)
		String hourStr = "" + hours12;

		// 5. build minutes as string WITH leading zero if needed (08 not 8)
		String minStr;
		if (mins < 10) {
			minStr = "0" + mins;
		} else {
			minStr = "" + mins;
		}

		// 6. final single print in required format
		System.out.println(hourStr + ":" + minStr + " " + suffix);
	}
}