package day12_switch_ternary;

public class ORLogicWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		System.out.println("Grade");
		// A B C -> Pass D,E is fail
		
		switch(grade) {
		case'B':
		case 'A':
		case 'C':
			System.out.println("pass");
			break;
		case'D':
		case 'E':
			System.out.println("Failed");
			break;
			default:
				System.out.println("Invalid");
		
			}

	}

}
