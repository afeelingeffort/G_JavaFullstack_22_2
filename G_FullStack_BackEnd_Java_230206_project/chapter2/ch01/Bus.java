package ch01;

public class Bus {
	String busPassenger;
	int busCharge;
	int busNumber;

	public void busDepart() {
		System.out.println(busNumber + "버스가 출발합니다.");
	}

	public void busLeave() {
		System.out.println(busNumber + "버스가 떠납니다.");
	}

	public void busCharge() {
		System.out.println(busNumber + "버스의 요금은 " + busCharge + "원 입니다.");
	}

	public void busPassenger() {
		System.out.println(busPassenger + "승객이 " + busNumber + "버스를 탑니다.");
	}

} // end of class
