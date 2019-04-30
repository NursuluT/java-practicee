package day07_scanner_operator;

public class PreAndPost {
	public static void main(String[] args) {
		int num = 10;
		int num2 = num++;
		System.out.println("num: " + num);
		System.out.println("num2: " +num2);
		
		int n = 20;
		int n2 = ++n;
	  System.out.println("n: " +n);
	  System.out.println("n2: " +n2);
	  
	  int i = 10;
	  i++;
	  ++i;
	  System.out.println("Value: " + i);
	  
	  int bananas = 6;//8
	  int pears = bananas++;//6
	  int apples = ++bananas;//8
	  
	  System.out.println("Bananas: " + bananas);
	  System.out.println("pears: " + pears);
	  System.out.println("apples: " + apples);
	  
	  int friends = 10;
	  System.out.println(friends++);//10
	  System.out.println(friends);//11
	  System.out.println(++friends);//12
	  
	  int p1 = 10;
	  int sum = p1++ +5;
	  // p1 + 5 and assign to sum
	  //p1 = p1 +1;
	  
	  System.out.println("sum: " +sum);
	  System.out.println("p1: "+ p1);
	  
	  int batteries = 8;
	  int oldBatteries = 5;
	  int totalBatteries = batteries++ + ++oldBatteries;
	  System.out.println("Batteries: "+ batteries);//9
	  System.out.println("old batteries: " + oldBatteries);//6
	  System.out.println("total batteries: " + totalBatteries);//14
	  
	  
	}

}
