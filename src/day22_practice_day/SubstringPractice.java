package day22_practice_day;

public class SubstringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "java";
		System.out.println(word.substring(0,2));
		//print each character in separate line using substring
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3));
		System.out.println("##############");
		
		int i = 0;
		System.out.println(word.substring(i ,i+1));
		i++;
		System.out.println(word.substring(i ,i+1));
		i++;
		System.out.println(word.substring(i ,i+1));
		i++;
		System.out.println(word.substring(i ,i+1));
		i++;
		
		for(int n = 0; n<=3; n++) {
			System.out.println(word.substring(n, n+1));
			
			String letter = word.substring(n, n+1);
			System.out.println(letter);
			
			System.out.println("########Reverse######");
		
		}
			int start =1;
			int end =10;
			String word2 ="UnitedStates";
			System.out.println(word2.substring(start, end));
			System.out.println(word2.substring(2, 3));
			System.out.println(word2.substring(6, 7));
			
			System.out.println(word2.substring(6));
			
			String word3 ="apple";
			System.out.println(word3.substring(word3.length()-1));
			
			
			
			
		}

	}

}
