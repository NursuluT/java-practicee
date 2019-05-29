package day51_inheritance04;

public class AtTheGym {

	public static void main(String[] args) {
		Exercise e = new Exercise();
		Running r = new Running();
		Swimming s = new Swimming();
		Yoga y = new Yoga();
		JuiJitsu j = new JuiJitsu();
		Sprinting sp = new Sprinting();
		
      System.out.println(e.perform(30)); 
      System.out.println(r.perform(40));
      System.out.println(s.perform(45));
      System.out.println(y.perform(60));
      System.out.println(j.perform(60));
      System.out.println(sp.perform(25));
      
      System.out.println("=================");
      
      SnowBoarding sn = new SnowBoarding();
      System.out.println(sn.perform(100));
	}

}
