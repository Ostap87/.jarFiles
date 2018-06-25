package pac1;

public class FindingMax {

		public static int findMax(int a[], int n) {

			// n is a length of our array

			// base case, where it will stop
			if (n == 1) {
				return a[0];
			}

			// recursive case
			return Math.max(a[n - 1], findMax(a, n - 1));
		}

		public static void main(String[] args) {

			int[] array = { 4, 6, 2, 9, 55, 0 };

			System.out.println(findMax(array, 6));

		}

	}
