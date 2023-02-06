package ch01;

public class MainTest1 {

	// main함수 - 코드의 시작점
	public static void main(String[] args) {

		// 데이터타입 - 사용자 정의 타입(대문자 --> 참조 타입)
		Student studentKim = new Student();

		studentKim.studentId = 1;
		studentKim.studentName = "홍길동";
		studentKim.address = "부산시 해운대구";

		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();
		
		System.out.println("--------------------");

		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentId = 2;
		studentLee.address = "부산시 진구";
		
		studentLee.study();
		studentLee.showInfo();

	} // end of main

} // end of class
