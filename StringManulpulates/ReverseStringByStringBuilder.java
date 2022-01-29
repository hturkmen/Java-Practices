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
		
		//2th way by arrays
		str= "Halil Turkmen";
		String s2 = "";
		for (int i=str.length()-1;i>=0;i--) {
			s2+=str.charAt(i);
		}
		System.out.println(s2);
	}
	
}
