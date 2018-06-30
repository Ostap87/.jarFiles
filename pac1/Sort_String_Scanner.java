package pac1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort_String_Scanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Add any data : ");
		List<String> data = new ArrayList<>();
		String[] str = scan.nextLine().split("\\s");
		for (int i = 0; i < str.length; i++) {
			data.add(str[i]);
			Collections.sort(data);
		}

		System.out.println("Result" + data);

		scan.close();
	}

}
