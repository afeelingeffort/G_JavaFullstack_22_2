package ch13;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟음");
	}

	@Override
	public void wiper() {
		System.out.println("사람이 작동을 시킵니다.");
	}
	
	@Override
	public void run() {
		stop();
		super.run();
	}
	
}
