package day16_substring_manipulation;

public class GetNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String sentence = "i wrote [1236] lines of code";
     int start = sentence.indexOf('[')+1;
     int end = sentence.indexOf(']');
    String codeCount =  sentence.substring(start, end);
     System.out.println("lines of code " +codeCount);
     System.out.println("Lines of code " +sentence.substring(sentence.indexOf('[')+1,sentence.indexOf(']')));
     
     int count = Integer.parseInt(codeCount);
     if(count>20){
    	 
    	 System.out.println("Wrote more than 20 lines of code today");
     }else {
    	 System.out.println("Not enough coding for today");
     }
    	 
     }
	}


