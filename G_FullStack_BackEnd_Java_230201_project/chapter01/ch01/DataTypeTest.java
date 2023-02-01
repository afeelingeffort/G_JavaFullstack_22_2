package ch01;

public class DataTypeTest {

	// 코드의 시작 (main함수)
	public static void main(String[] args) {
		
		//1. 정수 550을 name1 이름으로 변수에 담아 보세요.
		int name1 = 550;
		
		//2. 정수 22억을 name2 이름으로 변수에 담아 보세요.
		long name2 = 2200000000L;
		
		//3. 문자 A를 name3 이름으로 담아 보세요.
		char name3 ='A';
		
		//4. 실수 float 타입으로 0.12345678을 name4 이름으로 변수에 담아 보세요.
		float name4 = 0.12345678F;
		
		//5. 실수 double 타입으로 200.0035을 name5 이름으로 변수에 담아 보세요.
		double name5 = 200.0035;
		
		//6. 논리 자료형 isOk 이름의 변수를 선언해 보세요.
		boolean isOk; //카멜노테이션 - 낙타 표기법
		
		//7. isOk 변수에 값을 false로 초기화 해보세요.
		isOk = false;
		
		//8. isOk 변수에 값을 true로 변경해보세요.
		isOk = true;
		
		//9. 변수란 무엇인지 서술해 보세요.
		System.out.println("변수란 값을 저장할 수 있고 값이 변하는 저장공간");
		
		//10. 기본 데이터 타입에 종류 8가지를 서술해 보세요.
		System.out.println("정수형 - byte(1byte), short(2byte), int(4byte), long(8byte)");
		System.out.println("문자형 - char(2byte)");
		System.out.println("실수형 - float(4byte), double(8byte)");
		System.out.println("논리형 - double(1byte)");
		
	} // end of main

} // end of class
