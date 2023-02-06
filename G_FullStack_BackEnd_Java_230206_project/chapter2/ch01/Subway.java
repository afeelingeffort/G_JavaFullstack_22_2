package ch01;

public class Subway {
	String subwayPassenger;
	int subwayCharge;
	int subwayNumber;

	public void subwayDepart() {
		System.out.println(subwayNumber + "지하철이 출발합니다.");
	}

	public void subwayLeave() {
		System.out.println(subwayNumber + "지하철이 떠납니다.");
	}

	public void subwayCharge() {
		System.out.println("지하철의 요금은 " + subwayCharge + "원 입니다.");
	}

	public void subwayPassenger() {
		System.out.println(subwayPassenger + "승객이 " + subwayNumber + "지하철을 탑니다.");
	}

} // end of class
