package starcraft3;

public class Zergling extends Unit {

	public Zergling(String name) {
		this.name = name;
		this.power = 3;
		this.hp = 50;
	}

	// 저글링이 질럿을 공격합니다.
//	public void attack(Zealot zealot) {
//		if (this.hp <= 0) {
//			System.out.println(this.name + " 사망하였습니다.");
//			return; // return 값을 반환 할 때 사용할 수 있고 실행에 종료를 시킬 수도 있다.
//		}
//		System.out.println(this.name + "이 " + zealot.getName() + " 을 공격합니다.");
//		// 여기서 저글링에 공격력은 3 이다.
//		zealot.beAttacked(this.power);
//	}

	// 저글링이 마린을 공격합니다.
//	public void attack(Marine marine) {
//		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
//		marine.beAttacked(this.power);
//	}


}