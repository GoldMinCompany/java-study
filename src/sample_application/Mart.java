package sample_application;

import java.util.Random;

public class Mart {

	public static void main(String[] args) {
		
		/*
		 * 내가 가진 돈이 2000원
		 * 어떤 물건을 사는데 물건의 가격이 랜덤이다
		 * 
		 * 이 물건을 살 수 있으면 "구매 성공" 이라고 출력하고
		 * 살 수 없으면 "구매 실패"라고 출력한다. 
		 * 
		 * 살 수 있는 조건 (내가 가진 돈 >= 물건가격) ==> 구매 성공!
		 */
		int money = 2000;
		
		//Ctrl + Shift + O
		//랜덤한 숫자를 가져오는 코드 
		Random random = new Random();
		
		//int 범위에서 숫자 중의 하나 값을 호출
//		int price = random.nextInt();
		
		int price = random.nextInt(4000); // 0~3999 중 하나 
		
		System.out.println("내가 가진 돈 : " + money);
		System.out.println("상품의 가격  : " + price);
		
		if (money >= price) {
			System.out.println("구매 성공!");
		}else {
			System.out.println("구매 실패!");
		}
		
		

	}

}
