package day18_while_doWhile_loops;

public class StairCase {

	public static void main(String[] args) throws InterruptedException {
		String stairs ="*";
		int num = 1;
		
         while(num<=10) {
        	 System.out.println(stairs);
        	 stairs+="*";
        	 num++;
        	 Thread.sleep(400);
        	 
         }
         
         
         
         
         
	}

}
