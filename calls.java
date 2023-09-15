public class calls {
	public static void func_c(int a, int b, int c) {
		a = 8;
		// show the stack diagram when you reach this comment.
	}

	public static void func_b(int a, int b, int c) {
		b = 6;
		c = 7;
		func_c(a, b, c );
	}

	public static void func_a(int a, int b, int c) {
		a = 4;
		c = 5;
		func_b( a, b, c );
	}

	public static void main ( String[] argv ) {
		int a = 1, b = 2, c = 3;
		func_a( a, b, c );
	}
}
