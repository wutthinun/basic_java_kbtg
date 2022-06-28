import java.util.Scanner;

public class IfDecition {
	public static void main(String[] args) {

		// int score = Integer.valueOf(args[0]);
		// getGrade(score);

		System.out.println(getGrade(49));
		System.out.println(getGrade(50));
		System.out.println(getGrade(59));
		System.out.println(getGrade(60));
		System.out.println(getGrade(69));
		System.out.println(getGrade(70));
		System.out.println(getGrade(79));
		System.out.println(getGrade(80));
	}

	private static String getGrade(int score) {
		if (score < 50)
			return "F";
		else if (score < 60)
			return "D";
		else if (score < 70)
			return "C";
		else if (score < 80)
			return "B";
		else
			return "A";
	}
}
