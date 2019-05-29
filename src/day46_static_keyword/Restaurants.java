package day46_static_keyword;

public class Restaurants {

	public static void main(String[] args) {
		Dinner Mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner Dad = new Dinner();
		
		System.out.println("Total slices: "+Dinner.pizzaSlices);
		
		Dad.takeASlice();
		kid.takeASlice();
		Mom.takeASlice();
		
		System.out.println("Total slices: "+Dinner.pizzaSlices);
		System.out.println("Total slices: "+Dad.pizzaSlices);
		
		kid.takeAslice(3);//2
		Dad.takeAslice(2);//0
		//Mom.takeASlice();
		
		System.out.println("Total slices: "+Mom.pizzaSlices);//0
		System.out.println("Total slices: "+Dinner.pizzaSlices);//0
		

	}

}
