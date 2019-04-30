package day27_arrays05;
import java.util.*;
public class ArraysClass{

	public static void main(String[] args) {
         int[] nums = {43, 12, 56, 8, 9};
         //toString method
     System.out.println(Arrays.toString(nums));
     String str = Arrays.toString(nums); 
     System.out.println(str);
        
     
     //sort method
     //sorts array in ascending order
     
         Arrays.sort(nums);
         System.out.println(Arrays.toString(nums));
         String[]language = {"Zulu", "Spanish","Italian","English","Arabic", "Uzbek"};
         Arrays.sort(language);
         System.out.println(Arrays.toString(language));
         
        int[]nums2 = {87,658,965,0,23};
       // System.out.println(Arrays.toString(nums2));
        Arrays.sort(nums2);
        int lowest= nums2[0];
        int largest= nums2[nums2.length -1];
        System.out.println("Lowest number: " +lowest);
        System.out.println("Largest number: " +largest);
        
        
	}

}
