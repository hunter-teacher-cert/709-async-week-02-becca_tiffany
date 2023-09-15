public class calls {
	public static void func_c(int a, int b, int c) {
		a = 8;
        System.out.printf("func_c: a [%d]\n", a);
		// show the stack diagram when you reach this comment.
	}

	public static void func_b(int a, int b, int c) {
		b = 6;
		c = 7;
        System.out.printf("func_b: b [%d], c [%d]\n", b, c);
		func_c(a, b, c );
	}

	public static void func_a(int a, int b, int c) {
		a = 4;
		c = 5;
        System.out.printf("func_a: a [%d], c [%d]\n", a, c);
		func_b( a, b, c );
	}

	public static void main ( String[] argv ) {
		int a = 1, b = 2, c = 3;
        System.out.printf("Main: a [%d], b [%d], c [%d]\n", a, b, c);
		func_a( a, b, c );
	}
}
