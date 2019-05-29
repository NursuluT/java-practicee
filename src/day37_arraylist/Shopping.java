package day37_arraylist;

import java.util.*;

public class Shopping {

	public static void main(String[] args) {
		ArrayList<String>shopping =new ArrayList<>();
        shopping.add("banana");
        shopping.add("milk");
        shopping.add("apple");
        shopping.add("grape");
        shopping.add("cheese");
        shopping.add("juice");
        
        int  count = shopping.size();
        System.out.println("Shopping list: "+shopping.size());
        System.out.println(shopping);
        System.out.println(shopping.get(0));
        System.out.println(shopping.get(count-1));
        
        shopping.remove("banana");
        System.out.println(shopping);
        System.out.println(shopping.get(0));
        shopping.remove(0);
        System.out.println(shopping.toString());
        
        for(String item:shopping) {
        	System.out.println(item);
        }
        //remove all item at once
        shopping.clear();
        System.out.println(shopping);
	}

}
