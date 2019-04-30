package day18_while_doWhile_loops;

public class Alphabet {

	public static void main(String[] args) throws InterruptedException {
	
		
		 char letter1 = 'z';
	      while(letter1>='a') {
	    	  System.out.print(letter1 +" ");
	          letter1--;
	      }   
	          
	      	char letter = 'a';
			while(letter<='z') {
				System.out.print(letter+" ");
				letter++;
				
			}
			char capitals = 'A';
			while(capitals<='Z') {
				System.out.print(capitals+" ");
				capitals++;
		
	}
			String letters ="";
			char myLetter ='A';
			while(myLetter<='Z') {
				letters = letters +myLetter;
				System.out.println(letters);
				myLetter++;
				Thread.sleep(400);
			}
			
			
			
		
	}
}
