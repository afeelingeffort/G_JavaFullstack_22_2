package ch05;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int studentId;
	private String name;
	private String email;
	// Tip - 자료구조와 배열은 가능한 멤버변수 선언과 동시에 초기화하자.
	private List<Enrollment> enrollments = new ArrayList<>();

	public Student(int studentId, String name, String email) {
		this.studentId = studentId;
		this.name = name;
		this.email = email;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}

	// 등록 기능 추가
	public void addEnrollment(Enrollment enrollment) {
		enrollments.add(enrollment);
	}
}
