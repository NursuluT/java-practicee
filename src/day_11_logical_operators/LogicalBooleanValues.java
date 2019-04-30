package day_11_logical_operators;

public class LogicalBooleanValues {

	public static void main(String[] args) {
		boolean b1 = 5 > 10 && 10 > 100;
		System.out.println("B1: " +b1);//false
		
		boolean b2 = 'a' == 'a' && 123>100;
		System.out.println("B2: " +b2);//true
		
		
		boolean b3 = true && 10>= 10&& 1000 <=900;
		System.out.println("B3: " +b3);//false
		
		boolean b4 = false && false && 10==10;
		System.out.println("B4: " +b4);//false
	
		boolean b5 = false || true && 10==10;
		System.out.println("B5: " +b5);//true
		
		boolean b6 = false && true || 10==10;//true
		System.out.println("B6: " +b6);

		boolean b7 = false && true || 10==10;
		System.out.println("B7: " +b7);//true
		
		boolean b8 = false && (true || 10==10);
		System.out.println("B8: " +b8);//false
		
		
		boolean topicDone = true;
		boolean isMoreThan3Pm = true;
		boolean everyThingIsClear = true||false;
		
		boolean letsGoForABreak = topicDone && isMoreThan3Pm && everyThingIsClear;
		System.out.println("LetsGoToBreak: " +letsGoForABreak);
		
		boolean b9 = !(true || true) && true;
		System.out.println("B9: "+b9);//false
		
		boolean b10 = !true || true && false;
		System.out.println("B10: "+b10);//false
		
		boolean b11 = true;
		System.out.println(!b11);// boolean reversing from right to left
		
		
		
		
	}

}
