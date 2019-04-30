package Day4_Primitives_Operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		//+-addition operator 
		System.out.println(55+5);
		int chairs = 140;
		System.out.println(chairs +2);
		
		int moreChairs = chairs + 5;
		System.out.println(moreChairs);
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		
		//-Subtruction. Minus
		System.out.println(500-123);	
		
		int result = 44-23;
        System.out.println(result);
        
        double balance = 1200.50;
        double transaction = 56.44;
        balance = balance - transaction;
        System.out.println(balance);
		
        //create a variable linesOfCode and assign 50
        //you deleted 2 lines
        //decrease the value of linesOfCode by 2 and print "Lines of code 48"
        int linesOfCode = 50;
     
        System.out.println("lines of code " + linesOfCode);
        linesOfCode = linesOfCode-2;
        System.out.println("lines of code " + linesOfCode);
        System.out.println(linesOfCode-2);
        //multiplication*
        System.out.println(22*2);
        
        //declare variable classes and assign 5
        int classes = 5;
        System.out.println(linesOfCode * classes);
        int totalLinesOfCode = linesOfCode * classes;
        System.out.println("total lines of code= " + totalLinesOfCode);
        //Division operator /
        System.out.println(10/3);//3
        System.out.println(55/5);//11
        System.out.println(10.0/3);//3.33333333335
        System.out.println(15/7);//2
        System.out.println(15.0/7);//2.1428571427143
        System.out.println(5/2);
        
        System.out.println(11/0);// throw error while running the code
        
      
        
        
        
	
	}

}
