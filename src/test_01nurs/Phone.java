package test_01nurs;

import java.util.ArrayList;

public class Phone {
	private String brand, color;
	private double price, screenZise;
	private int storage;
	private static int numOfPhones=0;
	private static double totalPriceOfPhone;
	public static ArrayList<Phone> arr = new ArrayList<>();
	
	Phone(){
		this("none specified","none specified",  0.0, 0.0, 0);
	}
	Phone(String brand, String color, double price, double screenSize, int storage){
		this.setBrand(brand);
		this.setColor(color);
		this.setPrice(price);
	    setScreenZise(screenSize);
	    setStorage(storage);
	    numOfPhones++;
	    totalPriceOfPhone+=price;
	    arr.add(this);
	}
	
	Phone(String brand, double price){
		this(brand, "none specified",price, 0.0, 0);
		
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", color=" + color + ", price=" + price + ", screenZise=" + screenZise
				+ ", storage=" + storage + "]";
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getScreenZise() {
		return screenZise;
	}

	public void setScreenZise(double screenZise) {
		this.screenZise = screenZise;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public static int getNumOfPhones() {
		return numOfPhones;
	}

	public static void setNumOfPhones(int numOfPhones) {
		Phone.numOfPhones = numOfPhones;
	}

	public static void getTotalOfPhone() {
		System.out.printf("$%.2f",totalPriceOfPhone);
		//return totalPriceOfPhone;
	}

	public static void setTotalOfPhone(double totalOfPhone) {
		Phone.totalPriceOfPhone = totalOfPhone;
	}
	public static void getTotalPriceOfPhone() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
