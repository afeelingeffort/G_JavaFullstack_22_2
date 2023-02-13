package ch06;

public class UserInfoMsSqlDao implements IUserInfoDAO{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL : 저장 기능 호출 ");
		System.out.println("이름 : " + userInfo.getUserName() );
		System.out.println("PW : " + userInfo.getPw());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL : 수정 기능 호출 ");
		System.out.println("이름 : " + userInfo.getUserName() );
		System.out.println("PW : " + userInfo.getPw());	
	}

	@Override
	public void deleteUserInfo(String userName) {
		System.out.println("MSSQL : 삭제 기능 호출 ");
		System.out.println("이름 : " + userName);		
	}

	@Override
	public void selectUserInfo(String userName) {
		System.out.println("MSSQL : 조회 기능 호출 ");
		System.out.println("이름 : " + userName);
	}
	
}
