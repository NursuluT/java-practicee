package vasylreviewsession;

import java.util.ArrayList;

public class ArrayListOfSuperHeroes {
	public static void main(String[] args) {
		ArrayList<String>superheroes = new ArrayList<>();
		superheroes.add("spiderman");
		superheroes.add("Iron Man");
		//it takes 2 params
		//first is position, second is value to set
		//there is no second element so we can't set it.
		superheroes.add("Hulk");
		superheroes.add("Wonder Woman");
		superheroes.add("Thor");
		superheroes.add("Batman");
		superheroes.add("Hellboy");
		superheroes.add("Superman");
		superheroes.add("Flash");
		superheroes.add("Captain America");
		superheroes.add("Ant-Man");
		superheroes.add("Aquaman");
		System.out.println(superheroes);
		//let's create an arrayList that will store superheroes that have space in the name
		ArrayList<String>superheroesWithSpace = new ArrayList<>();
		String longestName ="";
			for(String hero: superheroes) {
				//checks if name contains space
				//if so, add it to the new array list
			if(hero.contains(" ")) {
				superheroesWithSpace.add(hero);
			}
			if(hero.length()>longestName.length()) {
				longestName = hero;
			}
		}
		System.out.println(superheroesWithSpace);
		System.out.println("The longest Name: "+longestName);
		//How to find second longest word?
		//first lets find longest one 
		//loop through arrayList again/but his time do not include longest word in the search
		String secondLongest ="";
		for(String hero: superheroes) {
			if(hero.length()>secondLongest.length()&&!hero.equals(longestName)) {
				secondLongest = hero;
			  }
		 }
		 System.out.println("Second longest name: "+secondLongest);
		
		
		
		
	}

}
