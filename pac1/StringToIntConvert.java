package pac1;


public class StringToIntConvert {

	public static int StringToInt(String a) {

		String str = "";

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (a.charAt(i) == '.')
				break;
			if (Character.isDigit(ch)) {
				str += ch;
			}
		}

		int t = Integer.parseInt(str);
		return t;
	}
	/*
	 * int basePrice = StringToIntConvert.StringToInt(baseStrPrice);
		System.out.println("Base price was converted : " + basePrice + "$");

		if (remPriceInt == basePrice) {
			System.out.println("Verified");
		} else {
			System.out.println("NOT Verified");
		}

	 */
}
