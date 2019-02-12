package learningJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceTest {

	public static void main(String[] args) {
		
		String str ="LearningJava";
		   char[] chararr=str.toCharArray();
		   
		   Map<Character,Integer> map =new HashMap<Character,Integer>();
		   
		   for (Character c :chararr) {
			   if(map.containsKey(c)) {
				   map.put(c, map.get(c)+1);
			   }else {
				   map.put(c, 1);
			   }
		   }
		
		   System.out.println(map);
		   Set<Entry<Character,Integer>> entrySet=map.entrySet();
		   for (Entry<Character,Integer> entry:entrySet) {
			   if(entry.getValue()>1) {
				   System.out.println("Duplicate charcters in the given String are " +entry.getKey());
			   }
		   }

	}
	
	              

}
