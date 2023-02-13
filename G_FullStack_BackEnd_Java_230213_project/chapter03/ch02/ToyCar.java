package ch02;

public class ToyCar implements RemoteController, SoundEffect{

	@Override
	public void turnOn() {
		System.out.println("장난감 자동차를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("장난감 자동차를 끕니다.");
	}

	@Override
	public void soundOn() {
		System.out.println("띠리리리리링");		
	}

}
