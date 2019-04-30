package day27_arrays05;

public class CanvasCourses {

	public static void main(String[] args) {
		//147 java programming
		//204 mentoring session
		//149 SDLC
		//152 QA testing
		//144 team activity
		//143 Welcome kit
		// split by "/" and get the last value from array
		//convert it to integer integer.persInt(..)
		//switch statement and find matching
		String url ="https://learn.cybertekschool.com/courses/149";
		String [] urlArr = url.split("/");
		System.out.println("url length: " + urlArr.length);
		System.out.println(urlArr[urlArr.length-1]);
        int courseID = Integer.parseInt(urlArr[4]);
        switch(courseID) {
        case 147:
        	System.out.println("Java programming");
        	break;
        case 204:
        	System.out.println("Mentoring session");
        	break;
        case 149:
        	System.out.println("SDLC");
        	break;
        case 152:
        	System.out.println("QA testing");
        	break;
        case 144:
        	System.out.println("Team activity");
        	break;
        case 143:
        	System.out.println("Welcome kit");
        	break;
        	default:
        		System.out.println("Invalid course ID");
        }
	}

}
