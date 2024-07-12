package sample_application;

/**
 * <pre>
 * Document 주석 
 * 클래스나 메소드 혹은 멤버변들을 설명하기 위한 가이드
 * 
 * 해당 클래스나 메소드 혹은 멤버변수에 마우스를 가져다 올리면
 * 주석이 툴팁으로 나타난다.
 * </pre> 
 */
public class TypeCastingExam {
	/**
	 * 형변환 예제 실습 번호 
	 */
	int testCaseNumber;
	
	/**
	 * 클래스의 실행을 담당하는 메소드. 
	 * 
	 * @param args 실행할 때 전달된 데이터 
	 */
	public static void main(String[] args) {
		
		/*
		 * short shortNumber = 10_000; int intNumber = shortNumber; //묵시적 형변환
		 * 
		 * long longNumber = 2_100_000_000L * 2; System.out.println(longNumber);
		 * 
		 * int intNumber2 = (int) longNumber; System.out.println(intNumber2);
		 * 
		 * System.out.println(Integer.MAX_VALUE); System.out.println(Integer.MAX_VALUE +
		 * 1);
		 * 
		 * int score1 = 100; int score2 = 30;
		 * 
		 * double divResult = (double) score1 / score2; System.out.println(divResult);
		 * 
		 * 
		 * double divResult2 = (score1 * 1.0) / score2 ; System.out.println(divResult2);
		 */
		//Q1
		
		int math = 80;
		int history = 70;
		int english = 90;
		int science = 85;
		
		int sum = math + history + english + science;
		
		double avg = (double) sum / 4 ;
		
		System.out.println("평균 : " + avg);
		
		//Q2

		int x = 9725;
		double y = (double) x / 100;
		
		System.out.println(y);
		
		//Q3

		double z = 93.167;
		z *= 100; 
		z = Math.round(z);
		z /= 100.0;
		
		System.out.println(z);
		
		
		double average2 = 93.167;
		double tempAverage = average2 * 100;
		System.out.println(tempAverage);
		
		long intAverage = Math.round(tempAverage);
		System.out.println(intAverage);
		
		average2 = (double) intAverage / 100 ;
		System.out.println(average2);
		
		System.out.println(round(average2, 2));
		
		
		
		/*
		 * 여러 줄을 주석으로 사용할 수 있는 문법
		 * Multi line Comment
		 */
		
		
	}
	public static double round(double value, int point) {
		
		
		double result = value * Math.pow(10, point);
		result = Math.round(result);
		result /= Math.pow(10, point);
		return result;
		
		
		
	}

}
