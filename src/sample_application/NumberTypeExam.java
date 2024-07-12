package sample_application;

public class NumberTypeExam {
	
	public static void main(String[] args) {
		
		// int 기본 타입
		byte byteNumber = 1;
		System.out.println(byteNumber);
		
		short shortNumber = 10;
		System.out.println(shortNumber);
		
		int intNumber = 1_000_000_000;
		System.out.println(intNumber);
		
		long longNumber = 3_000_000_000L;
		System.out.println(longNumber);
		
		
		float floatNumber = 50;
		double doubleNumber = 100;
		
		
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		
		// double 기본 타입
		float floatNumber2 = 10.33333333333F;
		double doubleNumber2 = 50.666666666;
		
		System.out.println(floatNumber2);
		System.out.println(doubleNumber2);
		
		final int AGE = 10; //상수는 모두 대문자로!
		final int MY_AGE = 30; //상수는 모두 대문자로, 구분은 under bar(_)로 구분한다. 
		
		// Error... 상수는 바꿀 수 없는 수이다.
		//AGE = 20; 
		
		
		
		
		
	}
	
}
