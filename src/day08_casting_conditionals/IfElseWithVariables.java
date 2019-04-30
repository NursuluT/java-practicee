package day08_casting_conditionals;

public class IfElseWithVariables {
	public static void main(String[] args) {
		int temperature = 45;
		
		if(temperature>=65) {
			System.out.println("it is nice day lets code java");
		}else {
			System.out.println("Stay home and code java");
			
		}
		
		//2 int variables, teamAScore, teamBScore
		//put a condition. check if teamA won."Team A won"
		//else "team B won or it was draw"
		int teamAScore = 5;
		int teamBScore = 4;
		if(teamAScore>=teamBScore) {
			
			System.out.println("Team A won");
		}else {
			System.out.println("we lost");
		}
		
	}

}
