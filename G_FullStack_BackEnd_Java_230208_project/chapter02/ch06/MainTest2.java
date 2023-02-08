package ch06;

import ch08.NumberPrinter;

public class MainTest2 {

	//main 함수
	public static void main(String[] args) {

		//클래스 안에 멤버 변수를 사용하려면
		//반드시 먼저 메모리에 올려야 한다.
		
		//수행 요청 - 클래스이름.
		System.out.println(NumberPrinter.waitNumber);
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		System.out.println(NumberPrinter.waitNumber);
		
		//static 문법적으로 class.xxx{} 안에 작성하지만 static 키워드를 가진 녀석은
		//잠시 자리만 빌려서 문법만 사용할 뿐 메모리를 사용하는 영역은 미리 쓰는 static영역이댜.
		
	} //end of main

} //end of class
