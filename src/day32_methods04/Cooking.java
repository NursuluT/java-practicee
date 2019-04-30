package day32_methods04;

public class Cooking {

	public static void main(String[] args) {
		
		makePancakes();
		makePasta();
		cook("omelette", "eggs, tomatoes, peppers, onions, olive oil");
	}
	public static void cook(String dish, String ingridients) {
		System.out.println("~~"+ dish.toUpperCase()+" RECIPE~~");
		add(ingridients);
		System.out.println("Cook it");
		System.out.println("~~"+ dish.toUpperCase()+" READY~~");
	}
	public static void makePasta() {
		System.out.println("~~ITALIAN PASTA RECIPE~~");
		add("water, salt, olive oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan cheese, Marinara");
		System.out.println("~~ENJOY DELICIOUS PASTA~~");
	}
		public static void makePancakes() {
		System.out.println("~~PANCAKES RECIPE~~");
			add("milk, eggs, flour, sugar, salt");
			mix(120);
			fry(3);
			add("oil");
			mix(15);
			fry(15);
			boil(15);
			System.out.println("~~ENJOY YOUR DELICIOUS PANCAKES~~");
		

	}
	public static void add(String ingridients) {
		System.out.println("Add "+ingridients);
	}
    public static void mix(int seconds) {
    	System.out.println("Mix it for "+seconds+" seconds");
    }
    public static void fry(int minutes) {
    	System.out.println("Fry it for "+minutes+" minutes");
    }
    public static void boil(int minutes) {
    	System.out.println("Boil it for "+ minutes+" minutes");
    }
    
}
