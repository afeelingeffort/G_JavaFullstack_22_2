package ex12;

public class MainTest1 {

	// main 함수
	public static void main(String[] args) {

		Computer[] computers = new Computer[300];

		computers[0] = new DeskTop();
		computers[1] = new DeskTop();
		computers[2] = new MyNoteBook();

		// computers.length -->300
		// 3개
		for (int i = 0; i < computers.length; i++) {
			if (computers[i] != null) {
				computers[i].display();
				if (computers[i] instanceof MyNoteBook) {
					System.out.println("좋은 노트북을 구매했네요.");
				}
			}
		}

//		Computer c1 = new DeskTop();
//		c1.display();
//		c1.typing();
//
//		Computer c2 = new MyNoteBook();
//		c2.display();
//		c2.typing();

	} // end of main

} // end of class
