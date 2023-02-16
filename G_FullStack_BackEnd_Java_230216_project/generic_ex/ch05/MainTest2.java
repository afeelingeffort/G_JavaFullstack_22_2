package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		// 윤년 계산하기
		// 4의 배수의 해는 윤년
		// 4의 배수이면서 100의 배수인 해는 윤년이 아님
		// 100의 배수이면서 400의 배수인 해는 윤년

		Scanner scn = new Scanner(System.in);

		int LEAP_YEAR = 0;

		System.out.println("연도를 입력하세요.>");
		LEAP_YEAR = scn.nextInt();

		if (LEAP_YEAR % 4 == 0 && LEAP_YEAR % 100 != 0 || LEAP_YEAR % 400 == 0) {
			System.out.println(LEAP_YEAR + "년은 윤년입니다.");
		} else {
			System.out.println(LEAP_YEAR + "년은 윤년이 아닙니다.");
		}
	}

}
