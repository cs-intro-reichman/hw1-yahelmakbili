// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// get input
		String hour = (args[0]);
		// find the min and hours
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		// find PM\AM
		String suffix;
		if (hours >= 12) {
			suffix = "PM";
		} else {
			suffix = "AM";
		}
		// print correct suffix, hours and minutes
		if ((hours < 12 || hours == 00) && (minutes < 10)) {
			System.out.println(hour + " AM");
		} else if (hours == 12) {
			System.out.println(hour + " PM");
		} else if ((hours > 12) && (minutes < 10)) {
			hours = (hours - 12);
			System.out.println(hours + ":0" + minutes + " PM");
		}
	}
}
