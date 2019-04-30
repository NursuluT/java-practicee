package day15_string_manipulation;

public class GoogleSearchTest {

	public static void main(String[] args) {
		String item = "java";
		String pageTitle = item +" - Google search";
		if(pageTitle.startsWith(item)) {
			System.out.println("Page title check passed");
		}else{
			System.out.println("Failed");
			return;
		}
			if(pageTitle.endsWith(pageTitle)) {
				System.out.println("Pass");
			
		}else {
			System.out.println("Failed");
		}

	}

}
