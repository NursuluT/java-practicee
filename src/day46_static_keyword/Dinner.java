package day46_static_keyword;

public class Dinner {
	public static int pizzaSlices = 8;
	
	
	public void takeASlice() {
		pizzaSlices--;
	}
	
	public void takeAslice(int count) {
		pizzaSlices-=count;
	}
	

}
