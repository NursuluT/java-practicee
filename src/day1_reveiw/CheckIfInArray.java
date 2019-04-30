package day1_reveiw;

public class CheckIfInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =55;
		int nums[] = {22, 33, 550, 22, 11, 90};
      
		
		boolean present = false;
		for(int num : nums) {
			System.out.println(num);
			if(num == n) {
				present = true;
			}
		}
		System.out.println("Is "+n+" present?- "+present);
	}

}
