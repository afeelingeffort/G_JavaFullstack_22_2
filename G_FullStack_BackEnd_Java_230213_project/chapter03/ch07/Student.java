package ch07;

public class Student {

	// 학번과 이름을 정의
	// 생성자
	private int id;
	private String name;

	public Student(int classNum, String name) {
		this.id = classNum;
		this.name = name;
	}

	// 1
	// toString --> 학번, 이름이 화면에 출력할 수 있도록 설계

	public String toString() {
		return "학번 : " + id + ", 이름 : " + name;
	}

	// 2
	// equals 메서드를 재정의 해주세요.
	// 이름이 같다면 동명이인입니다 라고 출력해주세요.
	
	// Object보다 Student가 더 큰 개념임
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student targetName = (Student) obj;
			if (this.name == targetName.name) {
				System.out.println("동명이인입니다.");
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Student st1 = new Student(1, "짱구");
		Student st2 = new Student(2, "찡구");
		Student st3 = new Student(3, "짱구");

		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);

		st1.equals(st3);
		
		Boolean result1 = st1.equals(st3);
		System.out.println(result1);

	} // end of main

} // end of class
