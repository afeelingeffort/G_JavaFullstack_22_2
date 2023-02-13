package starcraft3;

public class MainTest3 {

	// main 함수
	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("돌격대장질럿1");
		Marine marine1 = new Marine("귀신잡는해병은아님");
		
		zealot1.attack(marine1);
		marine1.showInfo();

	} // end of main

} // end of class
