package ch04;

import java.util.Scanner;

public class WhileMainTest3_2_teach {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("덧셈 정수값을 입력해주세요.");

		int num;
		int sum = 0;

		do {
			num = scn.nextInt();
			sum = sum + num;
		} while (num != 0); //<-- 0을 입력하면 연산에 결과는 false
		
		System.out.println("연산된 결과는 "+sum+"입니다.");
	}

}
