package day_43_encapsulation_constructor;

public class TeslaDealer {

	public static void main(String[] args) {
		
		
		}
		Tesla tesla = new Tesla();
		tesla.setModel("Model Y");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		System.out.println("Model: "+tesla.getModel());
		System.out.println("Range: "+tesla.getRange());
		System.out.println("Zero to60: "+tesla.getZeroTo60());
		System.out.println("Price: "+tesla.getPrice());
		System.out.println("selfDriving: " + tesla.isSelfDriving());
		
		System.out.println(tesla);
		System.out.println(tesla.toString());
		
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());
		//tesla, myTesla
		if(tesla.getZeroTo60()>myTesla.getZeroTo60()) {
			System.out.println("Faster mode: "+myTesla.getModel());
			System.out.println("0-60 speed: "+ myTesla.getZeroTo60());
			
		}else {
			System.out.println("Faster mode: "+tesla.getModel());
			System.out.println("0-60 speed: "+ tesla.getZeroTo60());
			
			
			
		}
      buy(myTesla);
      buy(tesla);
      
}
    public static void buy(Tesla car) {
	System.out.println("Purchasing: "+car.toString());
    }
}
