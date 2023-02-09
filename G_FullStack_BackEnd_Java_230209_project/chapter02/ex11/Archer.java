package ex11;

public class Archer extends Hero{
	public Archer(String name, int hp) {
		super(name, hp); // super 키워드는 부모 생성자를 호출
	}

	void fireArrow() {
		System.out.println(super.name + "가 불화살 공격을 합니다.");
	}

}
