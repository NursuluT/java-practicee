package day14_string_method;

public class StringSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Good morning";
		//check if it matches "Good morning" and print match or not match
		//convert to All upper case
		// and print
		if(str1.equals("Good morning")) {
			System.out.println("Match");
			
		}else {
			System.out.println("Not match");
		}
			if(str1.equalsIgnoreCase("good morning")) {
				System.out.println("Good morning");
			
			}else {
				System.out.println("Not Match - ignore case");
			}
				System.out.println(str1.toUpperCase());
				System.out.println(str1);
				str1 = str1.toUpperCase();
				System.out.println("After assignment: " +str1);
				
				// combine the above methods together
				//convert to all lowerCase first then check if it equals("good morning");
				
				if(str1.toLowerCase().equals("good morning")) {
					System.out.println("Chained methods: match");
				}else {
					System.out.println("Chained methods: do not match");
				}
			
				//Find out how many characters in the string
				
				String myName = "Nursulu";
				
				System.out.println(myName.length());
				
				int length = myName.length();
				
				System.out.println("My name is length: " + length);
				
				//username must be exactly 8 characters
				
				String userName = "Nursulu1";
				if(userName.length()==8) {
					System.out.println("Valid Username");
				}else {
					System.out.println("invalid username");
				}
				
				String password = "Bulentn";
				if(password.length()==6) {
					System.out.println("Valid password");
				}else {
					System.out.println("Invalid password");
				}
				
				String passWord = "woddenSpoon";
				if(password.length()>=6) {
					System.out.println("Password is good");
					
				}else {
					System.out.println("Password");
				}
				int passWordLength = password.length();
				if(passWordLength <=6) {
					System.out.println("Invalid password. Too short");
				}else {
					System.out.println("Valid password, good job");
				}
				
		}

	}


