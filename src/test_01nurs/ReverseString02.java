package test_01nurs;

public class ReverseString02 {

	public static void main(String[] args) {
		String s ="Nursulu";
		//Reverse a String:
		//Difference bw String StringBuffer
		//Do we have reverse function in String? NO!
		//1.Using for loop
		int len =s.length();//8
		String reverse = "";
		
		for(int i = len-1; i>=0; i--) {
			reverse = reverse+ s.charAt(i);//muineleS
		}
		System.out.println(reverse);
		
       // 2.Using StringBuffer class:
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	}

}
