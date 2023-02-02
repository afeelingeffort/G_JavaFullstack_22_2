package ch02;

public class ConstantTest {

	// 코드의 시작점 main함수
	public static void main(String[] args) {
		
		// 변수 != 상수(상수는 변하지 않는 수)
		// ex)원주율 3.14, 1년 12개월
		// 예약어 final 사용하면 된다.
		// 권장 사항 - 상수는 대문자로 사용하고 연결 단어는 _ 구분
		
		final int MAX_NUM = 12; //상수의 선언과 초기화
		// MAX_NUM = 200; 한번 초기화(값을 넣다)된 값은 변경할 수 없다.
		
		final int MIN_NUM; //상수의 선언
		MIN_NUM=1; //상수는 선언 후에 단 한 번만 초기화 할 수 있다.
		
	} //end of main

} //end of class
