package ch13;

/*
 * 
 * 템플릿 메서드 패턴을 구현
 * 핵심 run() 메서드이다.
 */
public abstract class Car {

	protected abstract void drive();
	protected abstract void stop();

	private void startCar() {
		System.out.println("시동을 켭니다.");
	}

	private void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	public abstract void wiper();
	
	// 실행의 흐름을 만들어 둔다.
	// final : 재정의할 수 없게 설계한다.
	// 하위 클래스에서 재정의할 수 없게 설계한다.
	public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
	//후크 메서드
	public void washCar() {
		//아무것도 구현하지 않음 --> 일반 메서드이다.
	}

}
