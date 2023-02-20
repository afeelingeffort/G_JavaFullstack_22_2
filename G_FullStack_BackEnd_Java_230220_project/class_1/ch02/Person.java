package ch02;

public class Person {
	private String name;
	private int age;
	private Address address;

	public Person(String name, int age, Address address) {
		this.address = address;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

}
