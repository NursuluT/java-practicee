package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      boolean isBreakTime =false;
      if(isBreakTime) {
    	  System.out.println("Break Till 8:35 PM");
    	  
      }else {
		
      System.out.println("Not break time yet.");
      boolean classTime =false;
      if (classTime==false) {
    	  System.out.println("Come back on time");
    	  		System.out.println("Stop talking");
    	  		System.out.println("Pay attention");
    	  		System.out.println("Code and have fun");
    	  		
      }else {
    	  System.out.println("take a walk");
      }
	boolean qualified = false;
	//send a notification message if not quilafied
	// we need to check if qualified variable contains FALSE
	
	if(qualified==false) {
		System.out.println("Your application was not approved. Thank you");
	}
		
	
}

}
}

