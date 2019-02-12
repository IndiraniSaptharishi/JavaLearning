package learningJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateinArray {

	public static void main(String[] args) {

		String[] names = { "Java", "C", "Java", "Python", "Selenium", "BDD", "C" };
		System.out.println("***********Comparing with each item in the array Solution***********");
		int len = names.length;
		System.out.println(len);
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (names[i].equals(names[j])) {
					System.out.println(names[i]);
				}
			}
		}
		
		//2.HashSet 
		System.out.println("***********HashSet Solution***********");
		Set<String> hs =new HashSet<String>();
		for (String name :names) {
			if(hs.add(name)== false) {
				System.out.println(name);
			}
		}
		
		//3.HashMap
		System.out.println("***********HashMap Solution***********");
	    Map<String,Integer> map =new HashMap<String,Integer>();
	    
	    for(String name:names) {
	    	Integer count =map.get(name);
	    	if(count==null) {
	    		map.put(name, 1);
	    		}else {
	    			map.put(name, ++count);
	    		}
	    }
	    System.out.println("Occurence of each value in the array" + map);
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		for(Entry<String,Integer> entry: entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		

	}

}
