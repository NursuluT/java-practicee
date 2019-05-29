package day50_inheritance03;

public class Company {

	public static void main(String[] args) {
		Employee emp = new Employee();
		FullTimeEmployee fte = new FullTimeEmployee();
		Contracter cont = new Contracter();
		
		emp.calculatePay(40 , 40);
		fte.calculatePay(40, 45);
	    cont.calculatePay(40, 55);

	}

}
