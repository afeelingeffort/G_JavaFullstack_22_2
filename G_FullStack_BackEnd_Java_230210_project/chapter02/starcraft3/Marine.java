package starcraft3;

/**
 * @author 김근호
 */
public class Marine extends Unit {

	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp = 70;
	}

	// 마린이 질럿을 공격 합니다.
//	public void attack(Zealot zealot) {
//		System.out.println(this.name + "이 " + zealot.getName() + " 을 공격 합니다");
//	}
//
//	// 마린이 저글링을 공격 합니다.
//	public void attack(Zergling zergling) {
//		System.out.println(this.name + "이 " + zergling.getName() + "을 공격 합니다.");
//	}

}