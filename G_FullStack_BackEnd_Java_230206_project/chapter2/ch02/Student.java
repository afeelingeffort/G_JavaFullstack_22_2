
package ch02;

public class Student {

	// 생성자 - constructor
	// 객체를 생성할 때 다음과 같은 모양으로 객체를 만들어라고 지시하는 것
	// 강제성을 부여하는 거와 같다.
	// 생성자는 객체를 생성할 때 반드시 존재해야 한다.

	String name;
	int number;
	int grade;

	// 생성자 만들어 보기 (사용자 정의 생성자)
	// 문법 - 생성자는 리턴타입이 없다. 파일 이름과 같다.
	// 대문자로 시작한다. --> class 이름과 같다. 대소문자까지 !
	// 생성자를 선언하는 문법(설계)
	public Student(String s, int n, int g) {
		name = s;
		number = n;
		grade = g;
	}

	//매개변수가 없다. --> 기본 생성자
	//개발자가 사용자 정의 생성자를 만들지 않았다면 자동으로 코드를 넣어준다. -> 컴파일러가 
	public Student() {}

	public String showStudentInfo() {
		return "학생의 이름은 "+name+"이고, 번호는 "+number+"이고, 학년은 "+grade+"학년 입니다.";
	}
	
} // end of class
