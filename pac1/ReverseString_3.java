/**
1. First, convert String to character array
   by using the built in Java String class 
   method toCharArray().
2. Then, scan the string from end  to start, 
   and print the character one by one.
 */
package pac1;

public class ReverseString_3 {

	public static void main(String[] args) {
		String str = "OkliM";
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}

}
