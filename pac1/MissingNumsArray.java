package pac1;

import java.util.ArrayList;

public class MissingNumsArray {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		int a[] = { 1, 3, 4, 6, 7, 9, 10 };
		int j = a[0];
		
		for (int i = 0; i < a.length; i++) {

			if (j == a[i]) {
				j++;
				continue;
			} else {
				arr.add(j);
				i--;
				j++;
			}
		}
		System.out.println("missing numburs");
		for (int r : arr) {
			System.out.print(" " + r);

		}

	}

}
