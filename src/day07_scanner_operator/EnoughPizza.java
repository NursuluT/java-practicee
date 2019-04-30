package day07_scanner_operator;

public class EnoughPizza {
	public static void main(String[] args) {
		//slices in pizza ->8
		//slices per student ->2
		int pizzaCount = 37;
		int studentsCount = 145;
		int pizzaSlices = 8;
		
		boolean isEnoughPizza = pizzaCount * 8 >= studentsCount *2;
		isEnoughPizza = pizzaCount *8/ studentsCount >= 2;
		System.out.println(isEnoughPizza);
		
		
		
		
		
	}

}
