package pac1;

public class NumberOfOccurence {

	public static void main(String[] args) {

		String s = "I love mymy country";
		String r = s.replaceAll("my", "").replaceAll("  ", " ");
		System.out.println(r);

	}

}
