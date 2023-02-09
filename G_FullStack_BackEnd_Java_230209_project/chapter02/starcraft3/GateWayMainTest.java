package starcraft3;

public class GateWayMainTest {

	public static void main(String[] args) {
		GateWay gateWay1 = new GateWay(3);
		Zealot[] zealots = gateWay1.createZealot(30);
		System.out.println(zealots[0]);
		System.out.println(zealots[1]);
		System.out.println(zealots[2]);
		System.out.println(zealots[3]);
		System.out.println(zealots[4]);
		System.out.println(zealots[5]);
		
//		arr[1]="나는 스트링"; 안들어가짐
	}
}
