package StringManulpulates;

import java.util.ArrayList;
import java.util.List;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        List<String> list = new ArrayList<String>();
        for (String str:names1){
            if (!list.contains(str)){
            	list.add(str);
            }
        }
        for (String str:names2){
            if (!list.contains(str)){
            	list.add(str);
            }
        }
        
        return list.toArray(new String[list.size()]);
        
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}