package day29_methods01;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		String[][] countriesArray = {
				{"USA",	"Washington DC"},
				{"Canada","Ottawa"},
				{"Mexico", "Mexico city"},
				{"Brasil", "Brasilia"},
				{"Peru", "Lima"},
				{"Argentina", "Boanes Aeros"},
				{"Bolivia",	"La Paz"},
				{"Macedonia","Scopia"},
				{"Kazakhstan","Nursultan"}};
        System.out.println(countriesArray[0][0]+"|"+countriesArray[0][1]);
        System.out.println(countriesArray[8][0]+"|"+countriesArray[8][1]);
        System.out.println(Arrays.deepToString(countriesArray));
        //Print all countries separated in same line separated by |
        for(int i = 0; i<countriesArray.length; i++) {
        	System.out.print(countriesArray[i][0]+"|");
        	}
        System.out.println();
        for(String[] country:countriesArray) {
        	System.out.print(country[0]+"|");
        	
        }
        	//get all the cities and add to cities [] array
        	//declare cities array and size needs to match countries array size
        	String [] cities = new String[countriesArray.length];
        	// null means no object it is not same as empty string
        	System.out.print(Arrays.toString(cities));
        	
        for(int i = 0; i<countriesArray.length; i++) {
            	cities[i]=countriesArray[i][1];
            	
        	}
        	System.out.println(Arrays.toString(cities));
        	// look for Bolivia in the countries Array and test if capital city is La paz
        	
        for (int row = 0;  row<countriesArray.length; row ++) {
 
        			if(countriesArray[row][0].equals("Bolivia")) {
        				System.out.println(countriesArray[row][1]);
        				if(countriesArray[row][1].equals("La paz")) {
        					System.out.println("Bolivia test passed");
        				}else {
        					System.out.println("Bolivia test failed");
        				}
        				break;
        				
        			
        				
        			}
        		}
        	}
	}


