package ch04;

import java.util.Scanner;

public class WhileMainTest4 {

	// main 작업자 (메인 쓰레드)
	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		// 상수 만들어보기
		final int USER_INPUT;

		Scanner scn = new Scanner(System.in);
		System.out.println("덧셈 정수값을 입력해주세요.");

		// 사용자가 0을 입력하면 프로그램을 종료하게 설계
		// 0이 아니라면 사용자가 입력한 값을 계속 덧셈해서 sum에 담아주세요.
		// while문으로 코드를 작성해주세요.

		USER_INPUT = scn.nextInt();
		while (num <= USER_INPUT) {
			sum += num;
			num++;
		}
		System.out.println("결과값 : " + sum);
	} // end of main

} // end of class
