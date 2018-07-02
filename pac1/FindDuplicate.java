package pac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Add any data : ");
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(scan.nextLine());
		}
		System.out.println("List size : " + list.size());
		Set<String> unique = new HashSet<>(list);
		System.out.println("Unique size" + unique.size());

	}

}
//List<String> names = Arrays.asList("Adam", "Adam", "Bob","Dave","Bob");
//
//Map<String, Integer> freMap = new HashMap<>();
//
//for (String each : names) {
//	if(!freMap.containsKey(each)) {
//		freMap.put(each, 1);
//	}else {
//		int existCount = freMap.get(each);
//		freMap.put(each, existCount+1);
//		
//	}
//}
//System.out.println(freMap);