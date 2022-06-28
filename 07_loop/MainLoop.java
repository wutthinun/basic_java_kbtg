public class MainLoop {
	public static void main(String[] args) {
		int [] numbers = {10, 20, 30, 40, 50};
		for (int x = 0; x < numbers.length; x++) {
			System.out.println(x + " : " + numbers[x]);
		}

		for (int i : numbers) {
			System.out.println("|> " + i);
		}

		System.out.println("=========================");
		{
			int x = 10;

			while (x < 20) {
				System.out.println("value of x : " + x);
				x++;
			}
		}
		System.out.println("=========================");
		{
			int x = 10;

			do {
				System.out.print("value of x : " + x);
				x++;
				System.out.print("\n");
			} while (x < 20);
		}
	}
}
