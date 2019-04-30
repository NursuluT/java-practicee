package day26_arrays4;

import java.util.Arrays;
import java.util.Random;

public class Names {

	public static void main(String[] args) {
		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla"};
		//Print number of names in array
			System.out.println("Total names: "+names.length);
			//print all names in single line
			System.out.println(Arrays.toString(names));
			//Print in column format
			//2 names in each line
			for(int i = 0; i< names.length; i+=2) {
				System.out.println(names[i]+", "+names[i]);
			}
		//print male names in single line separated by comma
			System.out.println("Male names: ");
			for(int m =0; m < names.length; m+=2) {
				System.out.print(names[m]+", ");
			}
	    //print female names
            System.out.println("\nFemale Names: " );
            for(int idx =1; idx < names.length; idx+=2) {
            	System.out.print(names[idx]+", ");
            }
            //print random name
            System.out.println("\nRnadom name");
            Random random = new Random();
           int r = random.nextInt(names.length);
           System.out.println("Random name: "+names[r]);
           //Print all names that are up to 4 characters, in uppercase, in same line
           for( String name : names) {
        	   if(name.length()<=4) {
        		   System.out.print(name.toUpperCase()+", ");
        		   
        	   }
        		   System.out.println("\n NAMES SORT BY LENGTH");
        	        String namesUpTo4 = "";
        	        String names5to6 = "";
        	        String names7orMore = "";
        	        for (String name1 : names) {
        	            if (name1.length()<=4) {
        	                namesUpTo4+=name1+", ";
        	            }else if (name1.length()>=5 ||name1.length()<+6) {
        	                        names5to6+=name1+", ";
        	            }else{
        	                names7orMore+=name1+", ";
        	                
        	        }
        	        
        	        
        	    }
        	        System.out.println("Names up to 4: "+namesUpTo4);
        	        System.out.println("Names 5 to 6: "+names5to6);
        	        System.out.println("Names up to 4: "+names7orMore);
        	        
        	       
        	        System.out.println(Arrays.toString(names));
        			//CODE HERE James, Mary,
        			for(int i = 0; i < names.length; i+=2) {
        				String temp = names[i];
        				names[i] = names[i+1];
        				names[i+1] = temp;	
        			}
        			System.out.println(Arrays.toString(names));
        			
        			
        			String str1 = "first word";
        			String str2 = "second word";
        			
        			String temp = str1;
        			str1 = str2;
        			str2 = temp;
        			
        			System.out.println("str1 - " + str1);
        			System.out.println("str2 - " + str2);
        			
        	        

        	}}
           }
	