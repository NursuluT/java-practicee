package day23_arrays;

public class PrintNumbersWithLoop {

	public static void main(String[] args) {
		// This is just to print numbers from 1 to 10
		for(int i =1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
     for(int j =1; j<=2; j++) {
    	 for(int i =1; i<=10; i++) {
    		 System.out.print(i+" ");
    	 }
    	 System.out.println();
     }
	}

}
