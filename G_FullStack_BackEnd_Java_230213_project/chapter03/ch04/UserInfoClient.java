package ch04;

public class UserInfoClient {

	// main --> 실행하는 코드 작성 (사용쪽 코드)
	public static void main(String[] args) {

		// 사용자한테 정보를 입력받는다.
		// String userName, String pw
		//스캐너 활용 --> 이름 한글자 이상 , pw 특수문자 포함
		String inputUserName = "홍길동";
		String inputUserPw = "1234";
		
		// 위에 받은 데이터를 Object타입으로 변환 --> DTO
		UserInfo userInfo=new UserInfo(inputUserName, inputUserPw);
		userInfo.showInfo();
		
		//위에는 클라이언트 쪽 코드 (개발자 작성)
		////////////////////////////
		//동작이 사용자에 정보를 입력하는 기능이 필요하다면
		//필요한 객체를 가져와서 사용하기만 하면 된다.
		UserInfoMysqlDao dao=new UserInfoMysqlDao();
		dao.insertUserInfo(userInfo);
		
//		dao.insertUserInfo(userInfo); //저장 기능
//		dao.updateUserInfo(userInfo); //수정 기능
//		dao.deleteUserInfo(userInfo.getUserName()); //삭제 기능 
//		dao.selectUserInfo(userInfo.getUserName()); //조회 기능
		
	} // end of main

} // end of class
