public class SwitchDecition {
	public static void main(String[] args) {

		switch (Integer.parseInt(args[0])) {
			case 0:
				System.out.println("May be SUN ?");
				break;
			case 1:
				System.out.println("SUN");
				break;

			case 2:
				System.out.println("MON");
				break;

			case 3:
				System.out.println("TUE");
				break;

			case 4:
				System.out.println("WEN");
				break;

			case 5:
				System.out.println("THU");
				break;

			case 6:
				System.out.println("FRI");
				break;

			case 7:
				System.out.println("SAT");
				break;

			default:
				System.out.println("Out of range");
				break;
		}
	}
}
