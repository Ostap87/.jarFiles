package pac1;

import java.util.Scanner;

public class CheckPalindromeSentance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentance");
		String s = sc.nextLine();
		String str = "";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				str += s.charAt(i);
			}
		}

		boolean isPalindrome = true;

		// LIVE ON TIME, || EMIT NO EVIL.

		for (int j = 0; j < str.length() / 2; j++) {
			if (String.valueOf(str.charAt(j)).equalsIgnoreCase(String.valueOf(str.charAt(str.length() - 1 - j)))) {
				continue;
			} else {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println(" your sentance is Palindrome");
		} else
			System.out.println(" your sentance is not a Palindrome");
		sc.close();
	}
}