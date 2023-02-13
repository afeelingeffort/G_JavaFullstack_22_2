
package ch02;

public class MainTest1 {

	// main 함수
	public static void main(String[] args) {

		Television tv = new Television();
		Refrigerator r = new Refrigerator();
		ToyRobot tr = new ToyRobot();
		ToyCar tc = new ToyCar();

		// 다형성
		RemoteController rc1 = new Television();
		RemoteController rc2 = new Refrigerator();
		RemoteController rc3 = new ToyRobot();
		RemoteController rc4 = new ToyCar();

		// 다형성 + 배열
		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = tv;
		remoteControllers[1] = r;
		remoteControllers[2] = tr;
		remoteControllers[3] = tc;

		// 문제 - 1
		// for문을 활용해서 전원을 전부 켜주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			if (remoteControllers != null) {
				remoteControllers[i].turnOn(); // 컴파일 시점, (turnOn, turnOff)
			}
		}

		// index값이 3번째 녀석이면 자기 자신의 타입을 화면에 출력해주세요.
		for (int i = 0; i < remoteControllers.length; i++) {
			if (i == 3) {
				System.out.println("3번째 녀석은 ToyCar 데이터 타입 입니다.");
			}
		}

		// 문제 - 3
		// 만약 데이터 toyRobot이면 멤버 변수 name값을 출력해주세요.
		for (int i = 0; i < remoteControllers.length; i++) {
			if (remoteControllers[i] instanceof ToyRobot) {
				//업캐스팅된 상태이기 때문에
				//자식 타입으로 바라보기 위해서는 다운 캐스팅 개념을 알고 있어야 한다.
				System.out.println(((ToyRobot)remoteControllers[i]).name);
			}
		}
		
		// 문제 - 4
		//장난감 로봇에 소리 기능을 추가해 달라는 요청
		//냉장고에도 소리 나는 기능을 추가해 달라고 요청
		//소리 기능 -> 인터페이스로 설계

	} // end of main

} // end of class
