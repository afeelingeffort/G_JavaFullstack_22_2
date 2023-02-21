package ch05;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {

		// 학생 생성
		Student student1 = new Student(1, "Alice", "alice@example.com");
		Student student2 = new Student(2, "Bob", "bob@example.com");

		// 과정 생성
		Course course1 = new Course(1, "Math", "introdction to Mathmatics");
		Course course2 = new Course(2, "English", "introdction to English");

		// 1번 학생이 Math 과정을 등록
		Enrollment enrol1 = new Enrollment(1, student2, course1);
		Enrollment enrol2 = new Enrollment(2, student2, course2);
		Enrollment enrol3 = new Enrollment(3, student1, course2);

		// 학생의 데이터에 내가 등록한 정보를 저장 시킬 수 있다.
		// ArrayList<Enrollment> list = new ArrayList<>();
		// list.add(enrol3);
		// list.add(enrol2);
		// student1.setEnrollments(list); //통으로 List 저장하는 녀석

		// 학생의 기능을 이용
		student1.addEnrollment(enrol1); // 0번째
		student1.addEnrollment(enrol3); // 2번째 자료구조 저장

		student2.addEnrollment(enrol2); // Bob

		// Bob가 신청한 과정의 이름을 화면에 출력하시오
		// 문제 해결방안 - 요청사항 : 학생으로 접근
		// ArrayList<Enrollment> a;
		// a.course;
		System.out.println(student2.getEnrollments().get(0).getCourse().getName());

		System.out.println("--------------------");
		// Alice가 신청한 과정에 이름을 화면에 출력하시오
		// 문제 해결 방안 - 요청사항 : 학생으로 접근
		for (int i = 0; i < student1.getEnrollments().size(); i++) {
			String studentName = student1.getName();
			Course course = student1.getEnrollments().get(i).getCourse();
			String courseName = course.getName();
			System.out.println(studentName + ", courseName : " + courseName);
		}
		// 위 코드는 학생과 과목을 Enrollment 클래스를 통해서 연결하는 예제 코드이다.
		
		//Enrollment1 학생 정보와 과목 정보를 출력해주세요
		//학생이름 : 이름 
		//수강과목 : 과목 이름
		//-------------------
		
		System.out.println("학생 이름 : "+enrol1.getStudent().getName());
		System.out.println("수강 과목 : "+enrol2.getCourse().getName());
		System.out.println("-----------------");
		
		//ArrayList를 생성해서 Enrollment에 저장
		ArrayList<Enrollment> items = new ArrayList<>();
		items.add(enrol1);
		items.add(enrol2);
		items.add(enrol3);
		
		for(Enrollment e : items) {
			System.out.println(e.getStudent().getName());
			System.out.println(e.getCourse().getName());
			System.out.println("----------------");
		}
		
		//foreach Alice의 수강하고 있는 과목 이름을 다시 한 번 더 출력하시오.
		for(Enrollment e2 : student1.getEnrollments()) {
			System.out.println(enrol1.getCourse().getName());
		}
	}

}
