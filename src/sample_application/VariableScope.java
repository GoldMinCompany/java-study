package sample_application;

public class VariableScope {
	public static void main(String[] args) {
	
		int number = 10;
		int other = 15;
		
		int bigNumber = 0;
		
		/*
		 *  number의 수와 other 수 중 큰 숫자는 무엇인가?
		 *  if와 else를 통해 비교를 한다. 
		 *  
		 */
		
		if(number > other) {
			//System.out.println(number);
			//System.out.println(number +"와 " + other + "중 큰 숫자는 " + number + "입니다.");
			bigNumber = number; 
		}
		else {
			//System.out.println(other);
			//System.out.println(number + "와 " + other + "중 큰 숫자는 "+ other + "입니다.");
			bigNumber = other;
		}
		
		System.out.println(number + "와 " + other+"중 큰 숫자는 "+bigNumber+"입니다.");
		
	}
}
