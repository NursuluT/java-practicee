package test_01nurs;
import java.util.Scanner;
public class FindNonDuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 Scanner input = null;
		int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
		    
		    int count=0;
		    for(int i = 0; i<nums.length;i++){
		      
		      for(int j=0; j<nums.length; j++){
		        
		        if(i != j && nums[i] == nums[j]) {
		          count++;
		          if(count ==0)
		          System.out.println(nums);
		        }
		        
		      
		    
		    
		    }
		  }
		}

	}


