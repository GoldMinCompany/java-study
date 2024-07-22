package sample_application;

import java.util.Scanner;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
		//키보드에서 숫자를 입력받고 변수에 할당
		//Ctrl + Shift + O
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("0보다 크고 100보다 작은 숫자를 입력하세요.");
		// 키보드에서 숫자 입력을 받아 변수에 할당
		int firstNumber = keyboard.nextInt();
		System.out.println("방금 입력한 숫자는 "+ firstNumber + "입니다.");
		
		boolean isGreaterThanZero = firstNumber > 0 ;
		System.out.println("0보다 큰가요? " + isGreaterThanZero);
		
		// 3항 연산자
		// 조건(boolean의 결과) ? true 일 때의 처리 : false 일 때의 처리
		// firstNumber가 0보다 작은 숫자인 경우에는 "음수입니다."
		// firstNumber가 0보다 큰 숫자인 경우에는 "양수입니다. "
		System.out.println(firstNumber > 0 ? "양수입니다. " : "음수입니다. ");
		
		
		boolean isLessThanHundred = firstNumber < 100 ;
		System.out.println("100보다 작은가요? " + isLessThanHundred);
		
		
		System.out.println(firstNumber < 100 ? "알맞은 숫자입니다. " : "너무 큰 숫자입니다. ");
		
		
		boolean isValidNumber = isGreaterThanZero && isLessThanHundred;
		System.out.println("0보다 크고 100보다 작은가요? "+isValidNumber);
		System.out.println(isValidNumber ? "성공" : "실패");
		
	}
}
