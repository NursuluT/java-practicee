package day50_inheritance03;

public class FullTimeEmployee extends Employee{
	@Override//check if method is really overriden
	public void calculatePay(int hours, double rate) {
		System.out.println("Employee total pay: "+(hours*rate));
		double total = (hours * rate)*1.5;
		System.out.println("FullTimeEmployee total pay: "+total);
}
}