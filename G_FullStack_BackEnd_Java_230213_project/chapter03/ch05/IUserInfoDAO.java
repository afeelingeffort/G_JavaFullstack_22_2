package ch05;

public interface IUserInfoDAO {

	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(String userName);
	void selectUserInfo(String userName);
}
