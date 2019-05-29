package vasylreviewsession;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperHeroList {
	public static void main(String[] args) {
		//we created an object of superhers class
		//why?
		//because we want to get instance variables superheroes
		//that stores array of strings with super heroes names.
		SuperHero object = new SuperHero();
		//we created an array object of strings
		ArrayList<String> superheroes = new ArrayList<String>();
		//add all method that allows to add whole arraylist/list
		superheroes.addAll(Arrays.asList(object.superheroes));
	}
}