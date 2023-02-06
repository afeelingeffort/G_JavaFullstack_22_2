package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	// main 함수
	public static void main(String[] args) {

		Human human = new Human();

		// 스캐너를 활용해서 값을 할당해 주세요.
		// 마지막에는 showInfo 메서드 호출해서 값을 확인해 주세요.

		Scanner scn = new Scanner(System.in);

		System.out.println("이름을 입력해주세요.>");
		human.name = scn.nextLine();

		System.out.println("키를 입력해주세요.>");
		human.height = scn.nextInt();

		System.out.println("몸무게를 입력해주세요.>");
		human.weight = scn.nextInt();

		System.out.println("성별을 입력해주세요.>");
		human.isMan = scn.nextBoolean();
		
		human.showInfo();
		// 심화 0번 입력시에는 showInfo호출
		// 스캐너를 통해서 showInfo메서드 호출 기능 만들어보기

		System.out.println("0 입력시 상태창 확인>");
		if(0==scn.nextInt()) {
			human.showInfo();
		}
		
	} // end of main

} // end of class
