package pac1;

public class ReverseString_4 {

	public static void main(String[] args) {
		reverse("OkliM");
	}

	public static void reverse(String s) {
		if (s == null || s.length() <= 1) {
			System.out.println(s);
		} else {
			System.out.print(s.charAt(s.length() - 1));
			reverse(s.substring(0, s.length() - 1));
		}

	}

}
