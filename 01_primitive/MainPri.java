public class MainPri {
	public static void main(String[] args) {
		int b10 = 101; // base 10
		int _b16 = 01426; // base 16
		int $b8 = 0x123; // base 8
		int bi = 0b110;
		System.out.println(b10);
		System.out.println(_b16);
		System.out.println($b8);
		System.out.println(bi);
		System.out.println("==============================");
		// ============================================

		long l = 15000000000L;
		double d = 3.17d;
		System.out.println(l);
		System.out.println(d);
		System.out.println("==============================");
		// ============================================

		float standard = 583.45f; // (standard)
		float scientific = 5.8345e2f; // (scientific)
		System.out.println(standard);
		System.out.println(scientific);
		System.out.println("==============================");
		// ============================================

		boolean bt = true;
		boolean bf = false;
		System.out.println(bt);
		System.out.println(bf);
		System.out.println("==============================");
		// ============================================

		char ch0 = 'a';
		char ch1 = '\u0061';
		char ch2 = '\n';
		char ch3 = '\"';
		System.out.println(ch0);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println("==============================");
	}
}
