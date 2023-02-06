package ch01;

//수입하다. 가져오다.
import java.util.Scanner;

public class MainTest3 {

	//main 함수
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println(scn);
		
		Student studentKim=new Student();

		System.out.println(studentKim); //주소값이 출력이 됨

		Student studentLee=new Student();
		System.out.println(studentLee); //주소값이 출력이 됨
		//**
		//기본 데이터 타입 -- 값(리터럴)이 출력이 된다.
		//참조 타입 - 주소값이 출력이 된다.
		
		System.out.println("---------------------");
		System.out.println(studentLee.studentId);
		System.out.println(studentLee.studentName);
		System.out.println(studentLee.address);
		System.out.println(studentLee.height);
		System.out.println(studentLee.isMarried);
		//멤버 변수는 메모리에 올라간 뒤 멤버 변수에 값을 할당하지 않으면
		//기본값으로 먼저 초기화 해준다. (컴파일러가 알아서 초기화 해줌)
		
	} //end of main

} //end of class
