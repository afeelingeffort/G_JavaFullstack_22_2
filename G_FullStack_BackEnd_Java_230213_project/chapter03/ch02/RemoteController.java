package ch02;

public interface RemoteController {

	//모든 변수 -> public static final
	//모든 메서드 -> 추상 메서드
	
	//인터페이스란?
	//구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도
	
	//특성
	//멤버 변수, 일반 구현 메서드를 가질 수 없고, 
	//오직 추상 메서드와 상수만을 멤버로 가질 수 있다.
	
	//인터페이스는 표준, 약속(강제성 있는 규칙)
	
	//추상클래스보다 추상화가 더 높다.
	
	public static final int SERIA_NUMBER = 100; //상수만 가질 수 있다.
	
	public abstract void turnOn();
//	public abstract void turnOff();
	
	//메서드 -> 추상  메서드
	void turnOff(); //abstract 키워드 생략 가능 why ->추상 메서드
	
}
