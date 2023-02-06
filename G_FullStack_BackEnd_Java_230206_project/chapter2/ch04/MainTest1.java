package ch04;

public class MainTest1 {

	// 코드의 시작점
	public static void main(String[] args) {
		Bus bus = new Bus(100);
		bus.take(1); // 태우다
		bus.take(1);
		bus.take(3);

		bus.takeOff(1);

		bus.showInfo();

		System.out.println("----------------------");
		Subway subway = new Subway(3);
		subway.take(3);
		
		subway.takeOff(2);
		
		subway.showInfo();

	} // end of main

} // end of class
