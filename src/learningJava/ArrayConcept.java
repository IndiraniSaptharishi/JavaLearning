package learningJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,2,6,7,3,4,4,5,5,6,7};
		
		
		Map<Integer,Integer> map =new HashMap<Integer,Integer>();
		
		for (Integer num :a) {
			Integer Count =map.get(num);
			if(Count==null) {
				map.put(num, 1);
			}else {
				map.put(num, ++Count);
			}
		}
		
		
		Set<Entry<Integer, Integer>> entryset  =map.entrySet();
		ArrayList<Integer> list =new ArrayList<Integer>();
		for(Entry<Integer, Integer> entry :entryset) {
			if(entry.getValue()>1) {
				list.add(entry.getKey());
				}
			}
		System.out.println("Duplicates are " +list);
		
		Set<Entry<Integer, Integer>> entryset1  =map.entrySet();
		ArrayList<Integer> nonduplist =new ArrayList<Integer>();
		for(Entry<Integer, Integer> entry1 :entryset1) {
			if(entry1.getValue()==1) {
				nonduplist.add(entry1.getKey());
				}
			}
		System.out.println("Non Duplicates are " +nonduplist);
		
 
}
	}

