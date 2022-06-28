public class LogicalOper {
	public static void main(String[] args) {
		System.out.println(true && true);
		System.out.println(true && false);

		System.out.println(true || true);
		System.out.println(true || false);

		System.out.println(true ^ true);
		System.out.println(true ^ false);

		System.out.println(!true);
		System.out.println(!false);

		int pass = 80;
		int score = 70;
		// ternary operator : exp1 ? exp2 : exp3
		System.out.println(score >= pass ? "Pass." : "T_T");
	}
}
