package day36_wrapperclasses;
import java.util.ArrayList;
public class ArrayListIntro {

	public static void main(String[] args) {
		//Create an ArrayList
		String [] namesArray = new String[5];
		ArrayList<String>names =new ArrayList<>();
		
		int[] numsArray =new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
		//How to assign values into arrayListpp
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		names.add("Maria");
		
		
		nums.add(100);
		nums.add(99);
		nums.add(8237);
		nums.add(789);
		nums.add(456);
		//nums.add(e)
		//read from arrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		System.out.println(names.get(5));
		
		System.out.println("Names count: "+names.size());
		System.out.println("Nums count: "+nums.size());
		
		System.out.println();
		
	    System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println(nums.get(3));
		System.out.println(nums.get(4));

		

	}

}
