package day53_inheritance06;

public class TestHiding {

	public static void main(String[] args) {
		City city = new City(101, "Miami");
		Capital cap = new Capital(412, "Pittsburgh", 300_000);
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
		
		cap.displayCount();
		
		// call static methods
		City.buildARoad();
		Capital.buildARoad();
		
		System.out.println("**********************");
		city.letsBuildARoad();
		cap.letsBuildARoad();
	}


	}

}
