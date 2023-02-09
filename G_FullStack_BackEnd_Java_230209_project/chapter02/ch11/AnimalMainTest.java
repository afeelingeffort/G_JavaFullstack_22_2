package ch11;

public class AnimalMainTest {

	// main 함수
	public static void main(String[] args) {

//		Human human = new Human();
		// 다형성을 적용하게 된다면 부모 타입으로 데이터 타입을 선언할 수 있고,
		// 실제 메모리에 올라가는 객체를 다형성이 적용되는 클래스를 인스턴스화 할 수 있다.

		Animal animalH = new Human();
		Animal animalT = new Tiger();

		// 다형성의 효용
		// 배열 --> 연관된 데이터 타입으로 모아서 관리할 수 있다.
		Animal[] arrayAnimals = new Animal[10];
		arrayAnimals[0] = animalH;
		arrayAnimals[1] = animalT;

		for (int i = 0; i < arrayAnimals.length; i++) {
			if (arrayAnimals[i] != null) {
				arrayAnimals[i].move();
				arrayAnimals[i].eating();
			}
		}

	} // end of main

} // end of class
