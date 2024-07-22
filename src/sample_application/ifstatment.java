package sample_application;

import java.util.Scanner;

public class ifstatment {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int korScore = keyboard.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		int engScore = keyboard.nextInt();
		
		System.out.print("숫자 점수 입력 : ");
		int mathScore = keyboard.nextInt();
		
		System.out.print("코딩 점수 입력 : ");
		int progScore = keyboard.nextInt();
		
		
		int sum = 0;
		double avg = 0;
		
		sum = korScore + engScore + mathScore + progScore ;
		avg = (double) sum / 4;
		
		String grade = null;
		
		if(avg >= 95) {
			
			grade = "A+";
		
		}else if(avg >= 90){
			
			grade = "A";
			
		}else if(avg >= 85){
			
			grade = "B+";
			
		}else if(avg >= 80){
			
			grade = "B";
			
		}else if(avg >= 70){
			
			grade = "C";
			
		}
		else{
			
			grade = "F";
			
		}
		
		System.out.println("성적 : " + grade);
		

	}

}
