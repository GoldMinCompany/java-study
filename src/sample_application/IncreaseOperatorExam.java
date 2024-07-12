package sample_application;

public class IncreaseOperatorExam {
	
	/**
	 * 클래스를 실행시키는 특별한 코드
	 * @param args
	 */
	public static void main(String[] args) {
		
		//스스로에게 1을 더하는 실습
		//일반 연산자
		
		int number1 = 0;
		number1 = number1 - 1;
		//System.out.println("number1 = " + number1);
		
		// 짧은 연산자
		number1 = 0; // 0으로 초기화(재할당)
		number1 -= 1;
		//System.out.println("number1 = " + number1);
		
		// 단한 연산자
		number1 = 0; // 0으로 초기화(재할당)
		
		number1 -- ; // 대입 후 number1 증가 
		System.out.println("number1 = " + number1--);
		System.out.println("number1 = " + number1--);
		System.out.println("number1 = " + number1--);
		System.out.println("number1 = " + number1);
		
		int number2 = 0;
		--number2; //number2 증가시킨 후 대입
		System.out.println(number2); // 1
		
		System.out.println(--number2);
		System.out.println(--number2);
		System.out.println(--number2);
		System.out.println(number2);
		
		
		
	}
	

}
