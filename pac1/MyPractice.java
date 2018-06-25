
package pac1;

public class MyPractice {

	public static void main(String[] args) {

		String str = "I Love My Country";
		String my = "my";
		str = str.toLowerCase().replaceAll(my, "").replaceAll("  ", " ");
		System.out.println(str);

	}
}
