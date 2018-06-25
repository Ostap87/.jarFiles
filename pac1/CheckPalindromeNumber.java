package pac1;

public class CheckPalindromeNumber {

	public static void main(String[] args) {

		int original = 33;
		int reverse = 0;
		int temp = original;

		while (temp != 0) {
			reverse = reverse * 10;
			reverse = reverse + (temp % 10);
			temp = temp / 10;
			// rev 0 rev 10 rev 120
			// rev 1 rev 12 rev 121
			// temp 12 temp 1 rev 0

		}

		if (reverse == original)
			System.out.println(reverse + " is a Palindrome");

		else
			System.out.println(reverse + " is not a Palindrome");
	}

}
