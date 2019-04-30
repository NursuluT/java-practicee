package day27_arrays05;

public class Tools {

	public static void main(String[] args) {
//		Java --> programming language
//		Selenium --> Test Automation
//		TestNG --> Unit Tests
//		JUnit --> Unit Tests
//		Cucumber --> BDD Style testing
//		Git --> Version control
//		Maven --> Building and execution for project

		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
		for(String tool : tools) {
		switch(tool) {
		case "Java":
			System.out.println("Java --> programming language");
			break;
		case "Selenium":
			System.out.println("Selenium --> Test Automation");
			break;
		case "TestNG":
			System.out.println("TestNG --> Unit Tests");
			break;
		case "JUnit":
			System.out.println("JUnit --> Unit Tests");
			break;
		case "Cucumber":
			System.out.println("Cucumber --> BDD Style testing");
			break;
		case "Git":
			System.out.println("Git --> Version control");
			break;
		case "Maven":
			System.out.println("Maven --> Building and execution for project");
			break;
			default:
				System.out.println("Unknown tool");
				break;
				
		
			
		}
	}
	}
}
