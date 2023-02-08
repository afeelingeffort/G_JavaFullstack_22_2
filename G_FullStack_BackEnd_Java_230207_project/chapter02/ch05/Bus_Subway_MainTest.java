package ch05;

public class Bus_Subway_MainTest {

	// main 함수
	public static void main(String[] args) {

		Student stu1 = new Student("James", 5_000);
		Student stu2 = new Student("Tomas", 10_000);

		Bus bus100 = new Bus(100);

		Subway subway1 = new Subway(1);

		stu1.takeBus(bus100);
		stu2.takeSubway(subway1);

		stu1.showInfo();
		stu2.showInfo();

		bus100.showBusInfo();
		subway1.showSubwayInfo();

		System.out.println("======================");

		Student stu3 = new Student("Edward", 20_000);

		Taxi kakaoTaxi = new Taxi("카카오 택시");
		
		stu3.takeTaxi(kakaoTaxi);
		
		stu3.showInfo();
		
		kakaoTaxi.showTaxiInfo();

	} // end of main

} // end of class
