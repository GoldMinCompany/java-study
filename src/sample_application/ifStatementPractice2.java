package sample_application;

import java.util.Scanner;

public class ifStatementPractice2 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("아버지 나이 : ");
		int father = keyboard.nextInt();
		
		System.out.print("어머니 나이 : ");
		int mather = keyboard.nextInt();
		
		System.out.print("딸 나이 : ");
		int daughter = keyboard.nextInt();
		
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int adultCount = 0;
		int kidCount = 0;
		
		if(father >=19) {
			adultCount ++;
		}
		else {
			kidCount ++;
		}
		
		if(mather >=19) {
			adultCount ++;
		}
		else {
			kidCount ++;
		}
		
		if(daughter >=19) {
			adultCount ++;
		}
		else {
			kidCount ++;
		}
			
		int fee = adultCount * adultOneWayFlightFare + kidCount * kidOneWayFlightFare;
		
		
		System.out.println("요금 : " + fee);
	
	}

}
