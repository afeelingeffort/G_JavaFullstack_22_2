package ex13;

import java.util.Random;

public class MainTest {

	// main 함수
	public static void main(String[] args) {

		// 1
		// 우리반 학생 이름들을 배열에 담아주세요
		// 랜덤 클래스를 사용해서
		// 한명을 추출해주세요

//		Random r=new Random(); 
		Student[] studentArray = new Student[18];

		studentArray[0] = new Student("편용림");
		studentArray[1] = new Student("김효린");
		studentArray[2] = new Student("배진석");
		studentArray[3] = new Student("강민정");
		studentArray[4] = new Student("한범진");
		studentArray[5] = new Student("손주이");
		studentArray[6] = new Student("김유주");
		studentArray[7] = new Student("김미정");
		studentArray[8] = new Student("김지현");
		studentArray[9] = new Student("박성희");
		studentArray[10] = new Student("이지운");
		studentArray[11] = new Student("정다운");
		studentArray[12] = new Student("이치승");
		studentArray[13] = new Student("이서영");
		studentArray[14] = new Student("전대영");
		studentArray[15] = new Student("김현우");
		studentArray[16] = new Student("김민우");
		studentArray[17] = new Student("이현서");

		Random r = new Random();

		int rStudent = r.nextInt(18);

		System.out.println(studentArray[rStudent].getName());

		// 2

		int[] myNumbers = new int[10];

		myNumbers[0] = 10;
		myNumbers[1] = 4;
		myNumbers[2] = 100;
		myNumbers[3] = 23;
		myNumbers[4] = 51;
		myNumbers[5] = 1;
		myNumbers[6] = 6;
		myNumbers[7] = 88;
		myNumbers[8] = 42;
		myNumbers[9] = 31;

		// 오름 차순으로 정렬해주세요.
		// for문, if문 활용

		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = i + 1; j < myNumbers.length; j++) {
				if (myNumbers[i] > myNumbers[j]) {
					int tmp = myNumbers[j];
					myNumbers[j] = myNumbers[i];
					myNumbers[i] = tmp;
				}
			}
		}

		for (int sort : myNumbers) {
			System.out.println(sort + " ");
		}

	} // end of main

} // end of class
