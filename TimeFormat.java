public class TimeFormat {
	public static void main(String[] args) {

		// הקלט: "HH:MM"
		String input = args[0];

		// ניקח את השעות והדקות כמספרים
		int hours24 = Integer.parseInt("" + input.charAt(0) + input.charAt(1));
		int mins = Integer.parseInt("" + input.charAt(3) + input.charAt(4));

		// לקבוע AM או PM
		String suffix;
		if (hours24 >= 12) {
			suffix = "PM";
		} else {
			suffix = "AM";
		}

		// להמיר לשעון 12 שעות
		int hours12;
		if (hours24 == 0) {
			// 00:xx -> 12:xx AM
			hours12 = 12;
		} else if (hours24 > 12) {
			// 13..23 -> (hour-12):xx PM
			hours12 = hours24 - 12;
		} else {
			// 01..12 נשאר אותו דבר
			hours12 = hours24;
		}

		// לבנות שעתיים ספרות
		String hourStr;
		if (hours12 < 10) {
			hourStr = "0" + hours12;
		} else {
			hourStr = "" + hours12;
		}

		// לבנות שתי ספרות דקות
		String minStr;
		if (mins < 10) {
			minStr = "0" + mins;
		} else {
			minStr = "" + mins;
		}

		// הדפסה אחת בלבד בכל המקרים
		System.out.println(hourStr + ":" + minStr + " " + suffix);
	}
}
