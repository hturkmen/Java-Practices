package StringManulpulates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
       // throw new UnsupportedOperationException("Waiting to be implemented.");
       List<Integer> list1 = new ArrayList<Integer>();
       
       //List<Integer> list2= new ArrayList<Integer>();
       for (int i=0;i<list.length;i++) {
    	   list1.add(list[i]);
       } 
       System.out.println(list1);
      // list1 = Arrays.asList(list);
       for(Integer i:list1) {
    	   for(Integer j:list1) {
    		   if (i+j == sum) {
    			   
    		   } 
    	   }
       }
       
       return list;
       
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}