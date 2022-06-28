public class SimpleArrays {
	public static void main(String[] args) {

		int[] ints = new int[5];
		System.out.println(ints);

		int[] ints2 = {1,2,3,4,5};
		System.out.println(ints2);

		System.out.println(ints[1]);
		System.out.println(ints2[1]);

		ints[1] = 20;
		System.out.println(ints[1]);

		//ints[5] = 11; //Index 5 out of bounds for length 5
		ints = new int[10]; // should be carefuly
		System.out.println(ints[1]);
	}
}
