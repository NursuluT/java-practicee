package day51_inheritance04;

public class JuiJitsu extends Exercise{
	@Override
    public int perform(int minutes) {
  	  System.out.println("JiuJitsu");
  	  return minutes * 12;
    }
}
