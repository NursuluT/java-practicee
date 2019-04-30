package day30_methods02;

public class StudentAtSchool {

	public static void main(String[] args) {
		      study("HTML");
		      study("SQL");
              sleep(7);
	}
 
	public static void study(String topic) {
		System.out.println("Student is studying topic "+topic);
	}
	public static void sleep(int hours) {
		System.out.println("Sudent has been sleeping for "+ hours +" hours");
	}
}
