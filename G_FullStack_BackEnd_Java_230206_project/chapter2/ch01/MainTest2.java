package ch01;

public class MainTest2 {

	//main 함수
	public static void main(String[] args) {

		Student studentKang = new Student();
		
		studentKang.studentId = 3;
		studentKang.studentName = "강민정";
		studentKang.address = "부산시 사상구";
		
		studentKang.goToilet();
		studentKang.eatFood();
		studentKang.takeTest();
		
	} //end of main

} //end of class
