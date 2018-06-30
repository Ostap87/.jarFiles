package pac1;

public class Fibonacci {
	public static int fibNums(int n) {

		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibNums(n - 1) + fibNums(n - 2);
		}
	}

	// 1 2 3 5 8 13 21 34 55 89
	// return fibNums(n - 1)--->(3-1)--->2  
	// return fibNums(n - 2)--->(3-2)--->1

	// return fibNums(n - 1)--->(2-1)--->1
	// return fibNums(n - 2)--->(2-2)--->0

	public static void main(String[] args) {
		System.out.println(fibNums(11));
	}
}
