package learningJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(2);
		array.add(2);
		array.add(2);
		array.add(6);
		array.add(9);
		System.out.println(array);
        System.out.println("Minimum value in the array is : "+Collections.min(array));
        
        
        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
        
        for (Integer eachInt:array) {
        	Integer count=map.get(eachInt);
        	if(count==null) {
        		map.put(eachInt, 1);
        	}else {
        		map.put(eachInt, ++count);
        	}
        	
        }
        System.out.println("Occurence of minimum value "+Collections.min(array)+ " in the arrayList: "
                           +map.get(Collections.min(array)));
	}
	
	
	
}
