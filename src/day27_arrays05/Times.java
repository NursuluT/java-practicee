package day27_arrays05;

public class Times {

	public static void main(String[] args) {
		//declare 2 int arrays
		int [] time1 = new int[2];
		int [] time2 = new int[2];
	    int t =5;
	    //System.out.println(times1[0]);
	    time1[0]=10;
	    time2[1]=15;
	    
	    
		  time1[0] = 16;
		  time2[1] = 10;
		  //before compatin gif both arrays has valid hour and minutes
		  if(time1[0] < 0 || time1[0]>23 ) {
			  System.out.println("Time1 has invalid value");
			  return;
			  
		  }
		  if(time1[0] < 0 || time1[0]>59) {
			  System.out.println("Time1 has invalid minute");
			  return;
		  }
		  if(time2[0] < 0 || time2[0]>23 ) {
			  System.out.println("Time2 has invalid value");
			  return;
			  
		  }
		  if(time2[0] < 0 || time2[0]>59) {
			  System.out.println("Time2 has invalid minute");
			  return;
		  }
	      if(time1[0]<time2[0]) {
	    	  System.out.println("Time1 is earlier");
	      
	      }else if(time2[0]< time1[0]) {
			System.out.println("Time2 is earlier");
		}else {
	       if(time1[1] <time2[1]) {
	    	   System.out.println("Time1 is earlier");
	       }
		}
	}

	}
