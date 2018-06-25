/**
1. Create a temporary byte[]  of length equal 
   to the length of the input string.
2. Store the bytes (which we get by using 
   getBytes() method) in reverse order into 
   the temporary byte[] .
3. Create a new String abject using byte[] to
   store result.
 */
package pac1;

public class ReverseString_1 {
	public static void main(String[] args) {
		String str = "MamaRamA";
				// getBytes() method to convert string
				// into bytes[].
		byte[] name = str.getBytes();
		byte[] result = new byte[name.length];
				// Store result in reverse order into the
				// result byte[]
		for (int i = 0; i < result.length; i++) {
			result[i] = name[name.length - i - 1];
				System.out.println(str);
				System.out.println(new String(result));
		}
	}

}
