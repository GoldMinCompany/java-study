package sample_application;

public class ShortCutOperatorExam {
	
	public static void main(String[] args) {
		
		// 일반 산술 연산자 실습
		int number1 = 10;
		number1 = number1 + 2;
		System.out.println(number1); // 12
		// Ctrl + F11 ==> 클래스 실행
		
		int number3 = 30;
		number3 = number3 + 6;
		System.out.println(number3);
		
		int number4 = 40;
		number4 = number4 - 10;
		System.out.println(number4);
		
		int number5 = 50;
		number5 = number5 * 12;
		System.out.println(number5);
		
		int number6 = 60;
		number6 = number6 / 14;
		System.out.println(number6);
		
		int number7 = 70;
		number7 = number7 % 16;
		System.out.println(number7);
		
		// 짧은 표현식 실습
		// 생긴 배경 : 코드를 짧은 시간내에 효율적으로 작성하기 위해
		
		int number2 = 20;
		number2 += 4;
		
		System.out.println(number2);
		
		number3 += 6;
		number4 -= 10;
		number5 *= 12;
		number6 /= 14;
		number7 %= 16;
		
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(number6);
		System.out.println(number7);
		
	}
}
