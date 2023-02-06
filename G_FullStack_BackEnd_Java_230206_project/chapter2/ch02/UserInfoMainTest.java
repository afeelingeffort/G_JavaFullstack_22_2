package ch02;

public class UserInfoMainTest {

	// main 함수
	public static void main(String[] args) {

		//기본 생성자는 사용자 정의 생성자가 있으면 만들어주지 않는다.
		
		UserInfo ui = new UserInfo("asdf", "강씨", "1234");
		System.out.println(ui.userId);
		System.out.println(ui.userName);
		System.out.println(ui.phone);

		System.out.println("-----------------------");
		UserInfo ui2 = new UserInfo("asdf2", "이씨");
		System.out.println(ui2.userId);
		System.out.println(ui2.userName);
		System.out.println(ui2.phone);

		System.out.println("-----------------------");
		UserInfo ui3 = new UserInfo("asdf3");
		System.out.println(ui3.userId);
		System.out.println(ui3.userName);
		System.out.println(ui3.phone);

		System.out.println("-----------------------");
		UserInfo ui4 = new UserInfo();
		ui4.userId = "asdf4";
		ui4.userName = "박씨";
		ui4.phone = "4321";
		System.out.println(ui4.userId);
		System.out.println(ui4.userName);
		System.out.println(ui4.phone);

	} // end of main

} // end of class
