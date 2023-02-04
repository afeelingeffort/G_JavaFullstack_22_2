
package ch06;

/*
 * 
 * 함수를 선언하는 코드 방법
 * 함수를 사용하는 코드 방법
 * */

public class Lion {

	// 정수를 반환하는 함수
	// 함수를 설계하는 코드 작성
	static int addNumber(int n1, int n2) { // 함수 선언부
		// 함수 구현부
		int result; // 지역 변수

		result = n1 + n2;

		return result; // return키워드를 만나면 실행의 제어권을 반납한다. (데이터)
	}

	// 아무 값도 반환하지 않는 함수 - void
	static void sayHello(String name) {
		System.out.println(name + "님 반갑습니당");
	}

	// 매개변수가 없는 함수를 설계
	static int calcSum() {
		int sum = 0;
		int i;

		for (i = 0; i <= 100; i++) {
			sum += i;
		}

		return sum;
	}

	// calcSum2, 정수값 3개를 받아서 덧셈 연산후 결과를 반환하시오 --> 리턴 타입은 double
	static double calcSum2(int n1, int n2, int n3) {
		double result = n1 + n2 + n3;

		return result;
	}

	// calcSum3 정수값 1개, 실수값 1개, 논리값 1개 받고
	// "정수값 : " [], 실수값 [], 논리값[] <-- 문자열 연산하고
	// 리턴 타입은 String으로 만들어 주세요.
	static String calcSum3(int i1, double d1, boolean b1) {
		String result = "정수값 : " + i1 + ", 실수값 : " + d1 + ", 논리값 : " + b1;

		return result;
	}

	// void : 텅빈, 리턴 값이 없다.
	// main 함수
	public static void main(String[] args) {

		// 함수 호출하기
		// 함수를 사용하는 코드
		int myNumber = addNumber(5, 10);
		System.out.println("myNumber : " + myNumber);

		// 함수 호출 2
		// 함수 호출할 때는 모양 맞추기이다.
		sayHello("하하하");
		sayHello("호호호");
		sayHello("헤헤헤");
		// int a = myNumber; 변수 호출

		// 함수 호출 3
		int calResult = calcSum(); // <--
		System.out.println(calResult);

		System.out.println(calcSum());

		// 함수 호출 4
		double cs2 = calcSum2(1, 2, 3);
		System.out.println(cs2);

		// 함수 호출 5
		String cs3 = calcSum3(1, 0.1, false);
		System.out.println(cs3);
	} // end of main

	//함수란?
	//자바에서 객체와 상관없이 독립적으로 어떠한 기능을 수행하는 일련의 코드 묶음
	
} // end of class
