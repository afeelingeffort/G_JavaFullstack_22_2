package ex11;

public class Wizard extends Hero {
	public Wizard(String name, int hp) {
		super(name, hp); // super 키워드는 부모 생성자를 호출
	}

	void freezing() {
		System.out.println(super.name + "가 얼음 공격을 합니다.");
	}

}
