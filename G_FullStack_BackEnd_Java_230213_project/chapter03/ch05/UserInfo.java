package ch05;

//DTO : Data Transfer Object 
public class UserInfo {

	public static int SERIAL_NUMBER = 0;
	private int id;
	private String userName;
	private String pw;

	public UserInfo(String userName, String pw) {
		SERIAL_NUMBER++;
		this.id = SERIAL_NUMBER;
		this.userName = userName;
		this.pw = pw;
	}

	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPw() {
		return pw;
	}

	public void showInfo() {
		System.out.println("사용자 정보 확인");
		System.out.println("userName : " + userName);
		System.out.println("pw : " + pw);
	}
}
