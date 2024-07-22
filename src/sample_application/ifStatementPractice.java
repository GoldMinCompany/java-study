package sample_application;

public class ifStatementPractice {
	
	public static void main(String[] args) {
		
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		String msg = null;
		
		
		int fee = 0;
		
		if(father >= 19) {
			
			fee += adultOneWayFlightFare;
			
		}
		else {
			fee += kidOneWayFlightFare;
		}
		
		if(mother >= 19) {
			
			fee += adultOneWayFlightFare;
		}
		else {
			
			fee += kidOneWayFlightFare;
		}
		
		if(daughter >= 19) {
			fee += adultOneWayFlightFare;
		}
		else{
			
			fee += kidOneWayFlightFare;
		}
		
		if(money >=  fee) {
			msg = "여행가자!";
		}
		else {
			msg = "다음에 가자!";
		}
		
		System.out.println("요금 : " + fee);
		System.out.println(msg);
	
	}

}
