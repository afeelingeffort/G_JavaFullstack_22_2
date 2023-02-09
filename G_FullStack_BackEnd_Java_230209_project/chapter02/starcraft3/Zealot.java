package starcraft3;

public class Zealot extends Unit{

	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}

	// 질럿이 저글링을 공격합니다.
	public void attack(Zergling zergling) {
		System.out.println(this.name + "이 " + zergling.getName() + " 을 공격합니다.");
		zergling.beAttacked(this.power);
	}

	// 질럿이 마린을 공력합니다.
	public void attack(Marine marine) {
		System.out.println(this.name + " 이 " + marine.getName() + " 을 공격합니다.");
		// 질럿 공격력은 현재 5 이다.
		marine.beAttacked(this.power);
	}


}