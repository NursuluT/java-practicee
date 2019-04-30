package officeHoursDay_02;

public class PrintUnique {

	public static void main(String[] args) {
         String str = "jjavabook"; //vbk
           //outer loop will take one char at a time
		
		    for(int i = 0; i < str.length(); i++) {
			//read one char from str and store to temp
			char temp = str.charAt(i);// j
			//inner loop will help compare with other chars
			int count =0;
			for(int j = 0; j < str.length(); j++) {
				if(temp == str.charAt(j) && i != j ) {
					//System.out.println(temp + " is duplicated");
					count++;
					break;
				}
			}
			if(count ==0) {
				System.out.println("Unique char is "+temp);
			}
		}
	}
}


