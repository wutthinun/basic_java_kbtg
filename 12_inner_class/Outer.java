public class Outer {
	int i;

	public class Inner {
		public void print() {
			System.out.println("Inner class " + i);
		}
	}

	void displayInner() {
		Inner inner = new Inner();
		System.out.println("Call display");
		inner.print();
	}
}
