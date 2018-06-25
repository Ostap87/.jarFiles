package pac1;

public class Factorials {			//24 = 1*2*3*4
	public static int factorial(int n) {

		// base cases
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else						// recursive case
			return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
}
