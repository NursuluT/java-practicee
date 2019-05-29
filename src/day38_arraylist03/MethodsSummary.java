package day38_arraylist03;
import java.util.*;
public class MethodsSummary {

	public static void main(String[] args) {
		List<String> list1 =new ArrayList<>();
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		//add method with index:"yellow will be placed to index0";
		list1.add(0,"yellow");
		//toString method to print values in same line
		System.out.println(list1.toString());
		//size method, return number of values
		System.out.println("Number of elements: "+list1.size());
		//get methods, return value from index
		System.out.println("3: "+list1.get(3));
        System.out.println("0: "+list1.get(0));
        //remove using index, remove value from index position
        list1.remove(0);//removes yellow
        System.out.println(list1.toString());
        //remove using value/element, removes element first occurence
        list1.remove("blue");//removes blue
        System.out.println(list1.toString());
        //set(index, value) replace certain index with new value
        list1.set(0, "orange");//red will be replaced by orange 
        System.out.println(list1.toString());
        //containsindexOf(value).returns indexOf value in the list
        System.out.println("grey: "+list1.indexOf("grey"));
        System.out.println("green: "+list1.indexOf("green"));
        //isEmpty() returns true if list is empty. size ==0;
        System.out.println("is list empty? -" +list1.isEmpty());
        System.out.println("is list empty? -" +(list1.size()==0));
        //contains(element) ==>returns true if value is present
        System.out.println("white in list? - "+list1.contains("white"));
        
        List<String>list2 = new ArrayList<>();
        //Add all->adds all values from one list into another
        list2.addAll(list1);
        System.out.println("list2: "+list2.toString());
        //containsAll. check if list has all values of another list
        System.out.println("Contains all:L "+list1.containsAll(list2));
        //equals. checksif two lists are exactly equal
        System.out.println("equals: "+list2.equals(list1));
        
        list2.add("pink");
        //removeAll(list). removes all matching values from the list that are in other list
        list2.removeAll(list1);
        System.out.println("LIst2 after removeAll: "+list2);
        System.out.println("list: "+list1);
        
        //add all(index, list) adds a new values starting from five given index
        list2.addAll(0, list1);
        System.out.println("List2 after list2.addAll(0, list1):"+list2);
        
        list1.clear();
        list2.clear();
        System.out.println("both empty? - "+(list1.isEmpty()&&list2.isEmpty()));
        
	}

}
