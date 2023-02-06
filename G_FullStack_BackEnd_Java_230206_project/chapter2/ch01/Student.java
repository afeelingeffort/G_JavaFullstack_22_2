package ch01;

public class Student {

	// 상태(속성)
	int studentId;
	String studentName;
	String address;
	double height; //0.0
	boolean isMarried; //false

	// 기능

	// 공부한다.
	public void study() {
		System.out.println(studentName + "학생이 공부를 합니다.");
	}

	// 휴식한다.
	public void breakTime() {
		System.out.println(studentName + "학생이 휴식을 합니다.");
	}

	public void showInfo() {
		System.out.println("========= 상태창 =========");
		System.out.println("학생의 ID값은 : " + studentId);
		System.out.println("학생의 이름은 : " + studentName);
		System.out.println("학생의 주소는 : " + address);
		System.out.println("========================");
	}

	// 함수와 메서드의 차이점
	// 메서드란
	// 자바에서 메서드란 객체의 기능을 구현하기 위해서 클래스 내부에 구현되는 메서드
	// 멤버 함수(member function)
	// 결론 : 메서드는 자신의 변수를 활용해서 객체에 기능을 구현하는 것

	// 학생의 기능(메서드) 3가지 정의해주세요

	// 먹는다.
	public void eatFood() {
		System.out.println(studentName + "학생이 음식을 먹습니다.");
	}

	// 시험을 친다.
	public void takeTest() {
		System.out.println(studentName + "학생이 시험을 칩니다.");
	}

	// 화장실에 간다.
	public void goToilet() {
		System.out.println(studentName + "학생이 화장실에 갑니다.");
	}

} // end of class
