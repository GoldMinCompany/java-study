package sample_application;

public class OperatorExam {

	public static void main(String[] args) {
		
		final int ONE_MINUTES = 60;
		
		//Quiz 1
//		int minutes = 5 ;
//		int seconds = 50;
//		
//		int time = 0;
		
//		time = minutes * ONE_MINUTES + seconds;
//		System.out.println("time : " + time);
		
		//Quiz 2
		int processTime = 145 ;
		
		int minutes = 0;
		int seconds = 0;
		
		minutes = processTime / ONE_MINUTES;
		seconds = processTime % ONE_MINUTES;
		
		System.out.println("minutes : " + minutes);
		System.out.println("seconds : " + seconds);
		
		//Quiz 3
		
		int celsius = 30;
		int fahrenheit = 0;
		
		fahrenheit = (celsius * 9/5) + 32;
		System.out.println("섭씨 : "+celsius);
		System.out.println("화씨 : "+fahrenheit);
		
	}

}
