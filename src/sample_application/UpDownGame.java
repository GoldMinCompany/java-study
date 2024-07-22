package sample_application;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	
	public static void main(String[] args) {
		
		/* 주석으로 사용한 코드를 Pseudo Code(의사 코드)라 하고 코드의 논리식을 문자열로 나열
		 * 1. 랜덤한 숫자 하나를 생성한다.
		 * 2. 사용자가 숫자 입력
		 * 3. 랜덤한 숫자와 사용자가 입력한 숫자가 같은지 비교한다. 
		 * 4. 같다면... "정답!"출력
		 * 5. 랜덤한 숫자가 사용자 입력한 숫자보다 작은지 비교... "Down!"출력
		 * 6. 랜덤한 숫자가 사용자 입력한 숫자보다 큰지 비교... "Up!" 출력  
		 */
		
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("숫자 입력 : ");
		int number = keyboard.nextInt();
		
		int randomNumber = random.nextInt(50)+1;
		System.out.println("랜덤 숫자 : "+ randomNumber);
		
		String msg = null;
		
		
		if(number == randomNumber) {
			
			//System.out.println("정답!");
			msg = "정답!";
		}
		else if(number > randomNumber) {
			
			//System.out.println("Up!");
			msg = "Up!";
		}
		else if(number < randomNumber) {
			
			//System.out.println("Down!");
			msg = "Down!";
		}
		
		System.out.println(msg);
	}

}
