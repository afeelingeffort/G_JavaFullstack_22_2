package ch05;

import java.util.Scanner;

public class UserMainTest2 {

	public static void main(String[] args) {
		// 스캐너 : 입력 장치(키보드 값을 받아주는 객체)
		// 정수값을 입력받을 때
		Scanner scn = new Scanner(System.in);

		int userInput1 = scn.nextInt();
		// nextInt() 개행문자 제거하지 않았기 때문에
		// 바로 아래 코드가 동작하고 완료되어진다.
		System.out.println(userInput1);
		System.out.println("이름을 입력해주세요.>");
		scn.nextLine();

		String name = scn.nextLine();
		System.out.println("name : " + name);

		// 스캐너를 활용해서 값을 입력받고 화면에 뿌려 주세요

		// 여러분들이 정의한 클래스를 가지고 값 할당 코드 작성

		// 정보를 출력해주세요
		System.out.println("========= 상태창 =========");
		// 코드 작성

		User user = new User();

		System.out.println("이름을 입력해주세요.>");
		user.userName = scn.nextLine();
		System.out.println(user.userName);

		System.out.println("나이를 입력해주세요.>");
		user.userAge = scn.nextInt();
		System.out.println(user.userAge);
		scn.nextLine();

		System.out.println("주소를 입력해주세요.>");
		user.userAddress = scn.nextLine();
		System.out.println(user.userAddress);

		System.out.println("전화번호를 입력해주세요.>");
		user.userNumber = scn.nextLine();
		System.out.println(user.userNumber);

		System.out.println("포인트를 입력해주세요.>");
		user.userPoint = scn.nextInt();
		System.out.println(user.userPoint);

		System.out.println("========================");

	} // end of main

} // end of class
