package day23_arrays;

public class ArrayOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names =new String[5];
		String [] names2 = {"Shaun", "Bill", "Roman", "Vlad", "Burak", "Maria"};
		
		System.out.println(names2[5]);
		System.out.println(names2[4]);
		System.out.println(names2[3]);
		System.out.println(names2[2]);
		System.out.println(names2[1]);
		//size = to number of items
		System.out.println("Number of items:"+names2.length);
		
		String[] countries = {};
		//countries[0] ="USA";
		//Array has fixed size 
		String name = null;
		String[] fruits = new String [] {"apple", "orange"};
		for(String fruit:fruits) {
			System.out.println(fruits);
			//for each loop stands for collection of data
			//we need specify data type, variable name: our collection of data
		}
		
		

	}

}
