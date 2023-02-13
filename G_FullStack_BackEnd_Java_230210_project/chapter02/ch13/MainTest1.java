package ch13;

public class MainTest1 {

	// main 함수
	public static void main(String[] args) {

		AICar aiCar = new AICar();
		aiCar.run();
		System.out.println("----------------");

		ManualCar manualCar = new ManualCar();
		manualCar.run();

	} // end of main

} // end of class
