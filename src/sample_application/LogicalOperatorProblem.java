package sample_application;

import java.util.Scanner;

public class LogicalOperatorProblem {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		/*
		 * 조건
		 * 정수형 변수 두개를 생성
		 * keyboard.nextInt()를 이용해 값을 각각의 변수에 할당
		 * 
		 * 두 변수의 값 중 큰 값을 가진 변수의 값을 출력!(3항 연산자 사용)
		 * 
		 */
		
		int firstNumber = keyboard.nextInt();
		int secondNumber = keyboard.nextInt();
		
		int biggestNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;
		System.out.println(biggestNumber);

	}

}
