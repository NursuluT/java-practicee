package officehours07_apr29;

public class Person {
	private String firstName;
       //the constructor takes an argument
	// in the body of the constructor
	public Person(String bDay) {
		System.out.println("constructing");
	}
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	private String lastName;
	private String birthday;
	

}
