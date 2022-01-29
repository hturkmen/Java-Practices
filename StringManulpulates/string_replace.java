package StringManulpulates;

public class string_replace {

	public static void main(String[] args) {
		String pwd= " 123Abc! ";
		
		boolean isFirstCharSpace = pwd.startsWith(" ");
		boolean isLastCharSpace=pwd.endsWith(" ");
		System.out.println(isFirstCharSpace +" "+ isLastCharSpace);
		int numofDigitals = pwd.replaceAll("\\D", "").length();
		System.out.println(numofDigitals);
		
	}

}
