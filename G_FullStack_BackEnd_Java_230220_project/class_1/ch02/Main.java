package ch02;

public class Main {

	// main 함수
	public static void main(String[] args) {
		Address address = new Address("해운대구 좌동 123", "부산", "롯데 103호", "456-12");
		Person person = new Person("홍길동", 10, address);

		System.out.println("name : "+person.getName());
		System.out.println("Address : "+person.getAddress().toString());
		//Person 클래스에서 Address 클래스를 참조할 수 있다.
		//Address 클래스는 Person 클래스를 참조할 수 없다.
		
	} // end of main

} // end of class
