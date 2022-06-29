import java.time.DayOfWeek;

public class Main {
	public static void main(String[] args) {
		System.out.println(DayOfWeek.SUNDAY);
		System.out.println("====================================");
		for (int i = 0; i < DayOfWeek.values().length; i++) {
			System.out.println(DayOfWeek.values()[i]);
		}
		System.out.println("====================================");

		for (DayOfWeek d : DayOfWeek.values())
			System.out.println(d);
		System.out.println("====================================");

		howDoUFeel(DayOfWeek.MONDAY);
		System.out.println("====================================");
		howDoUFeel(DayOfWeek.FRIDAY);
	}

	public static void howDoUFeel(DayOfWeek d) {
		switch(d) {
			case FRIDAY:
			case SATURDAY:
			case SUNDAY:
				System.out.println("Happy...");
				break;

			default:
				System.out.println("What................");
				break;
		}
	}
}
