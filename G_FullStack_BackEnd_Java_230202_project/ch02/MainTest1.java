package ch02;

public class MainTest1 {

	//main함수
	public static void main(String[] args) {

		//long - 8byte
		//int - 4byte
		//작은 상자에서 큰 상자로 들어갈 때는 자동 형 변환
		long l = 100; //<-- 자동 형 변환
		//R value --> 정수 값에 기본 연산 단위인 int형이다.
		//L value --> long 데이터 타입 int 형 데이터를 넣는 과정이기 때문에 자동 형 변환이다.
		System.out.println("l : "+l);
		
		//문법 작성하고 오류를 확인하는 시점은 --> 컴파일 시점
		//실행 버튼, 명령어를 통해서 실행하면 --> 런타임 시점
		
	} //end of main

} //end of class
