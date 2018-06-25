package pac1;

public class ILoveMyCountry {

	public static void main(String[] args) {

		String sentence = "I love my Fort Myers";
		String word = "my";
		sentence = sentence.replaceAll(word, "") // replace the word with empty string
				.replaceAll("\\s+", " "); // replace mutiple white spaces with one
		System.out.println(sentence);
	}
}
// String str = "I Love My Country";
// String my = "my";
// str = str.toLowerCase().replaceAll(my, "").replaceAll(" ", " ");
// System.out.println(str);
