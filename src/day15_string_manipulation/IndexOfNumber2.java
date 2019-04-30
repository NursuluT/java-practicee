package day15_string_manipulation;

public class IndexOfNumber2 {

	public static void main(String[] args) {
		String list = "cheese-banana-coffee-water-nuts";
		int firstDash = list.indexOf("-");
		System.out.println("first dash: " +firstDash);
		int secondDash = list.indexOf("-", 5);
		System.out.println("Second Dash: "+secondDash );
        int thirdDash = list.indexOf("-", 14);
        System.out.println("Third dash: " +thirdDash);
        
        int lastDash = list.lastIndexOf("-");
        System.out.println("Last dash " +lastDash);
        
       
        
        
	}

}
