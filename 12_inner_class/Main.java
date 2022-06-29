public class Main {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.i = 10;
		o.displayInner();

		Outer.Inner inner = o.new Inner();
		o.i = 20;
		inner.print();
	}
}
