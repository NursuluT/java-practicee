package day52_inheritance05;
import java.util.*;
public class FinalArrayList {

	public static void main(String[] args) {
		final ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("Orange");
		COLORS.add("Grey");
		COLORS.add("White");
		COLORS.add("Blue");
		
		System.out.println(COLORS.toString());
		COLORS.add("Black");
		System.out.println(COLORS.toString());
		
		//COLORS = new ArrayList<>();
//		System.out.println(COLORS.toString());
//		COLORS.add("Yellow");

	}

}
