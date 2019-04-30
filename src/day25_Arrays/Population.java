package day25_Arrays;

public class Population {

	public static void main(String[] args) {
		int[] population = new int[5];
		population[0]=45000;
		population[1]=32000;
		population[2]=50000;
		population[3]=25000;
		population[4]=48000;
		
		int[] population2 = {5000, 5000*2, 7000, 4455,8907};
		System.out.println("City 0 population :"+population[0]);
		System.out.println("City 1 population :"+population[1]);
		System.out.println("City 2 population :"+population[2]);
		System.out.println("City 3 population :"+population[3]);
		System.out.println("City 4 population :"+population[4]);
		
		int idx =0;
		System.out.println("City 0 population :"+population[idx]);
		
		idx++;
		System.out.println("City 1 population :"+population[idx]);
		
		String str ="abc";                                      //3
		System.out.println("City 1 population :" +population[str.length()]);
		
		
		String cities[]={"Miami", "London", "Tokyo", "Rome", "New-York"};
		
		System.out.println("Population of "+cities[0]+" "+population[0]);
		System.out.println("Population of "+cities[1]+" "+population[1]);
		System.out.println("Population of "+cities[2]+" "+population[2]);
		System.out.println("Population of "+cities[3]+" "+population[3]);
		System.out.println("Population of "+cities[4]+" "+population[4]);
	
		
		
				

	}

}
