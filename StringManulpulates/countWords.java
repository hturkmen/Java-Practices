package StringManulpulates;

import java.util.HashMap;
import java.util.Map;

public class countWords {

	public static void main(String[] args) {
		String str = " Youtube Gizli Daha videolarda yorumlar Gizli desteklenmez. Daha fazla bilgi edinin Gizli fazla Youtube ";
		str=str.trim();
		String  words[] = str.split(  " ");
		System.out.println(words.length);
		int i=0;
		Map<String,Integer> map = new HashMap<>();
		
		for (String s : words) {
			i++;
			System.out.println(i+" "+ s);	
			if (map.containsKey(s)) 
				map.put(s, map.get(s)+1);
			else   map.put(s, 1);
		} 
		System.out.println(map);
	}

}
