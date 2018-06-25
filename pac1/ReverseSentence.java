package pac1;

public class ReverseSentence {

	public static void main(String[] args) {

		String str = "I Love My Country";
		String[] sArr = str.split(" ");
		String result = "";

		for (int i = sArr.length - 1; i >= 0; i--) {
			result += (sArr[i] + " ");
		}

		System.out.println(result.trim());

	}

}
