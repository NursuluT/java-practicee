package day15_string_manipulation;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "nursulu@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat, avocados";
		
		if(list.contains("apples")) {
			System.out.println("Apples are there");
		}else {
			System.out.println("lets buy some apples");
		}
      boolean hasEggs = list.contains("eggs");
       System.out.println("Contains eggs: " +hasEggs);
	
	  boolean hasCucumbers = list.contains("cucumbers");
       System.out.println("Contains cucumber: " +hasCucumbers);
      
       email = "name@yahoo.com";
    		 
       if(email.contains("yahoo")) {
    	   System.out.println("it is yahoo email");
       }else if(email.contains("gmail.com")) {
    	   System.out.println("gmail");
       }else if(email.contains("hotmail")) {
    	   System.out.println("Hotmail account");
       }else {
    	   System.out.println("There is no such mail");
       }
       String etsyTitle = "Wooden spoon | Etsy";
       if(etsyTitle.contains(" | ")) {
    	   System.out.println("Pipe is there");
       }else {
    	   System.out.println("Pipe is not detected");
       }
       String myName = "Nursulu";
       if(myName.contains("a")|| myName.contains("e")) {
    	   System.out.println("Name does  contain a or e");
       }else {
    	   System.out.println("No it does not contain a, e");
       }
       
    
	}
}
