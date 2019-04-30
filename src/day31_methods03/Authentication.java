package day31_methods03;

public class Authentication {
	public static void main(String[] args) {
		 login("mentoring@cybertekschool.com", "mentor001");
	}
           /* Name: login
            * Return type: void
            * 2 String args/params: username, password 
            * Inside method:
            * validUsername ="mentoring@cybertekschool.com
            * validPassword= "mentor001
            * Print" login successful! welcome to okta
            * print "Invalid"
            */
         public static void login(String userName, String password) {
        	 
        	 String validUsername ="mentoring@cybertekschool.com";
        	  String validPassword ="mentor001";
        	 if(userName.equals(validUsername)||password.equals(validPassword)) {
        		 System.out.println("Login successfull");
        	 }else {
        		 System.out.println("Invalid username");
        	 }
        	
        	
        	 }
         }
	
	 

