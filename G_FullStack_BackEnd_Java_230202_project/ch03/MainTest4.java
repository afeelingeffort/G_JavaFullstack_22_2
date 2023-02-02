package ch03;

public class MainTest4 {

	//main함수 (main 쓰레드)
	public static void main(String[] args) {
		
		//증감 연산자, 감소 연산자
		//++, -- (how, why)
		
		int num1 = 1; //변수의 선언과 동시에 초기화
		
		num1++;
		System.out.println(num1); //변수의 값을 1증가 시킬 때 사용
		//num1 += 1;
		//num1 = num1 +1;
		
		int num2 = 1;
		
		num2--;
		System.out.println(num2);
		System.out.println("==============");
		
		//1. 증감 연산자가 뒤에 올 경우
		int num3 = 10;
		int num4;
		
		//11 = 10 + 1;
		//num3 값이 num4로 들어간다 그리고 세미콜론 이후에 증감연산자를 수행
		num4 = num3++;
		System.out.println(num4);
		System.out.println(num3); //num4에 값 10을 대입하고 세미콜론 기준 1증가
		
		
		System.out.println("==============");
		//2. 증감 연산자가 앞에 올 경우
		
		int num5 = 10;
		int num6;
		
		//세미콜론 기준으로 먼저 num5 변수에 접근해서 1증가 이후에 num6에 값을 대입
		num6 = ++num5;
		System.out.println(num6);
		
		System.out.println("==============");
		//감소 연산자 사용해보기 ! 앞에 있는 경우와 뒤에 있는 경우 코드 스스로 작성
		
		int num7 = 10;
		int num8;
		
		num6 = num7--;
		System.out.println(num6);
		
		int num9 = 10;
		int num10;
		
		num10 = --num9;
		System.out.println(num10);
	} //end of main

} //end of class
