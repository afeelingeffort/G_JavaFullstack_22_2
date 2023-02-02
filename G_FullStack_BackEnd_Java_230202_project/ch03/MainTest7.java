package ch03;

// 예약어 - 수입하다, 가져오다 / 자바 개발자들 미리 사용하라고 만들어 둠
import java.util.Scanner;

public class MainTest7 {

	// main함수
	public static void main(String[] args) {

		// 삼항 연산자
		// 조건식 ? 결과1 : 결과2;

		int num1 = (5 > 3) ? 10 : 20;
		// System.out.println(num1);

		int max = 0;
		System.out.println("입력 받은 두 수 중 큰 수를 출력하시오.");

		// JDK 에 만들어 둔 도구
		// 입력 장치 (키보드에 있는 어떠한 값을 받아 들여 주는 녀석)
		Scanner scn = new Scanner(System.in);
		
		System.out.println("입력 1 : ");
		int x = scn.nextInt(); //정수값만 받을 수 있는 녀석

		System.out.println("입력 2 : ");
		int y = scn.nextInt();

		System.out.println("==============");
		// 여기까지 코드가 내려온다면 x값이 담겨 있고 y값이 담겨 있는 상태이다.

		// x값과 y값을 비교해서 두 수 중 큰 수를 화면에 출력하시오.
		max = (x > y) ? x : y;
		System.out.println("두 수 중 큰 수:" + max);

	} // end of main

} // end of class
