package day33_methodsWithReturn;

public class PayCalculator {

	public static void main(String[] args) {
		int pay = getHourlyPay(40, 50);
		System.out.println("Total pay for 40 hours: "+pay);
		System.out.println(getHourlyPay(0, 10));
		int noPay = getHourlyPay(0, 10);
		System.out.println("NoPay: "+noPay);

}
	public static int getHourlyPay (int hours, int rate) {
		
		if(hours<=0) {
			System.out.println("Invalid hours");
			return 0;
		}if(rate<=0){
		System.out.println("Invalid rate");
		return 0;
		}
		int total = hours *rate;
        return total;
	}
}

