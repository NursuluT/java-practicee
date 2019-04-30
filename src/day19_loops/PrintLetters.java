package day19_loops;

import day06_operators2.ScannerYourName;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String word ="Amazon";
   int i =0;
   //print each character one by one in separate line
      while(i<=word.length()){
    	  System.out.println(word.charAt(i));
    	  i++;
    	  
    	  int idx = word.length()-1;
    	  while(idx>=0){
    	      System.out.println(word.charAt(idx));
    	      idx--;
    	  }
    	  
      }
   
	}

}
