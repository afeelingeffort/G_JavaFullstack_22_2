package ch05;

public class UserInfoClient {

	static String dbName = "MSSQL";
	
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
		
		
		IUserInfoDAO dao;
		if(UserInfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();
		}else {
			dao = new UserInfoMsSqlDao();
		}
		
		dao.insertUserInfo(userInfo);
		
		
	} // end of main

} // end of class
