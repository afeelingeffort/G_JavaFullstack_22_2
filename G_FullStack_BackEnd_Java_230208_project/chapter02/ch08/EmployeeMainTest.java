package ch08;

public class EmployeeMainTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setName("이순신");
		System.out.println(e1.serialNum);

		Employee e2 = new Employee();
		e2.setName("홍길동");

		Employee e3 = new Employee();
		e3.setName("티모");

		// static 변수만 사용을 하면
		// 각각의 객체가 가지는 상태값을 저장해야 한다면
		// 멤버 변수를 활용해서 사용해야 한다.
		System.out.println(Employee.serialNum);

		// 홍길동의 사원번호 확인 가능
		System.out.println(e2.getEmployeeId());
		// 티모에 사원번호 확인 가능
		System.out.println(e3.getEmployeeId());

	}

}
