package ch02;

/*
 * 여러줄 주석
 * 
 */
public class TypeConversion {

	// main함수
	public static void main(String[] args) {
		//형 변환 
		//자동 형 변환
		//강제 형 변환
		int iNumber1 = 100;
		System.out.println(iNumber1);
		
		//자동 형 변환
		double dNumber1 = iNumber1;
		System.out.println(dNumber1); //형이 변환되었기 때문에 자신에 맞는 형태로 출력됨
		
		//문제 만들어보기 !
		
		//쌍따옴표 - 문자열이라고 한다
		System.out.println("=================");
		double dNumber2 = 0.0012345;
		System.out.println(dNumber2);
		
		//강제 형 변환
		//강제 형 변한에 주의점
		int iNumber2 = (int)dNumber2; //개발자가 컴파일러한테 괜찮으니깐 강제로 넣어
		System.out.println(iNumber2);
		
		int iNumber3 = (int)10.95; //강제 형변환시 소수점 단위는 버림
		System.out.println(iNumber3);
		
		double a;
		int b;
		
		//1. a에 값 0.5를 담아 보세요.
		a = 0.5;
		//2. b에 값 10.5 리터럴값을 담아 보세요.
		b=(int)10.5;
		//강제 형변환시 데이터 손실이 생길 수 있다.
		
	} //end of main

} //end of class
