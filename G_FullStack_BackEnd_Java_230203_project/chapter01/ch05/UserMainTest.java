package ch05;

//클래스를 사용하는 쪽 코드 작성
public class UserMainTest {

	// 메인함수
	public static void main(String[] args) {

		// 메모리 올리고 값을 할당 후 화면에 출력
		User user = new User();
		
		user.userAddress = "부산시 사상구";
		user.userAge = 24;
		user.userName = "강민정";
		user.userNumber = "010-****-****";
		user.userPoint = 30;

		System.out.println(user.userAddress);
		System.out.println(user.userAge);
		System.out.println(user.userName);
		System.out.println(user.userNumber);
		System.out.println(user.userPoint);
	

	} // end of main
} // end of class
