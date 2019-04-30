package day28_multid_arrays;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {
		// read all data and assign to String array, 
		String [] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size: " +data.length);
		//Print each Restaurant information in separate lines
		//Print first row
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length-1]);
		System.out.println(Arrays.toString(data));
		int counter =0;
		for(String restaurant:data) {
			System.out.println("#"+counter+"=>"+restaurant);
			counter++;
		}
		//Print all restaurant information in state of VA, also count it
		//Print the number
		 int countVA =0;
		 for(String row:data) {
			 if(row.contains(",VA,") && row.contains(",22102,")) {
				 System.out.println(row);
				 countVA++;
			 }
		 }
		
                     System.out.println("#####Total restaurants in VA: "+countVA);
                     //Find all restaurant in state of VA
                     //Print the restaurant names along with city name
                     //Subway - Herndon
                   
                      for(String ress:data) {
                    	  if(ress.contains(",VA,")) {
                    		  String[] resArr =ress.split(",");
                    		  System.out.println(resArr[2]+"-"+resArr[1]);
                    	  }
                      }
                 
	}

}
