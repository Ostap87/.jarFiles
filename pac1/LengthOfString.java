package pac1;

public class LengthOfString {

	public static void main(String[] args) {

		String str = "Moloko";
		int i = 0;
		char[] ch = str.toCharArray();
		for (char name : ch) {
			i++;
		}
		System.out.println("We got : " + i);

	}

}
