package test_01nurs;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatElements {

	public static void main(String[] args) {
		
		
		String names []= {"Java", "JavaScript", "Ruby", "C", "Python", "Java",};
		
		//1. compare each element: O(nxn) --- worst solution 
		for(int i =0; i<names.length; i++) {
			for(int j = i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is: "+names[i]);
				}
					
				}
		      }
		System.out.println("*********");
		
		//2. using HashSet: Java Collection: it stores unique values: O(n)
		Set<String> store = new HashSet<String>();
		 for(String name : names) {
			 if(store.add(name)== false) {
				 System.out.println("Duplicate element is: "+name);
			 }
		 }
		 
		 //3. using HashMap
		 System.out.println("*********");
		 Map<String, Integer> storeMap = new HashMap<String, Integer>();
		 
		 for(String name : names) {
			Integer count =  storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			}else {
			   storeMap.put(name, ++count);
			}
		 }
		 
		 //get the values from this hashMap:
		
		
		
		

	}

}
