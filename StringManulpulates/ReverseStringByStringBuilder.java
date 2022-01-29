package StringManulpulates;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringByStringBuilder {
	// write a java program to reverse a string with string builder.
	
	
	public static void main(String[] args) {
		String str= "Halil Turkmen";
		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		str=sb.reverse().toString();
		System.out.println(str);
		
		
	}
	
}
