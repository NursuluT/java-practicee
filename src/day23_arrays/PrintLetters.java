package day23_arrays;

public class PrintLetters {

	public static void main(String[] args) {
		// outer loop will repeat printing of letters as many times as you want
		//in this case we are going to print 3 times
		// so we are repeating inner loop 3 times
		for(int i =0; i<3; i++) {
			
		for(char letter = 'a'; letter<='z';letter++) {
			System.out.print(letter+" ");
		
		}
		System.out.println();
		System.out.println("***************************************************  ");
	}
	}
}
