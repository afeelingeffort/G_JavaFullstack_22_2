package ch06;

import java.util.Scanner;

public class UserInfoClient {

	static String dbName = "Oracle";

	// main --> 실행하는 코드 작성 (사용쪽 코드)
	public static void main(String[] args) {

		// UserInfoOracleDao 만들어주세요.
		// 스캐너를 통해서 사용자 이름, 사용자 비번을 입력받기

		IUserInfoDAO dao;
		if (UserInfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();
		} else if (UserInfoClient.dbName.equals("MSSQL")) {
			dao = new UserInfoMsSqlDao();
		} else {
			dao = new UserInfoOracleDao();
		}

		Scanner scn = new Scanner(System.in);
		System.out.println("사용자의 이름>");
		String inputUserName = scn.nextLine();
		System.out.println("사용자의 비밀번호>");
		String inputUserPw = scn.nextLine();

		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		userInfo.showInfo();

		// 흐름 만들기
		// 1. 저장기능 2. 수정기능
		// dbName 변경해 가면서 코드 동작 확인해주세요.
		UserInfoOracleDao oracle = new UserInfoOracleDao();

		oracle.insertUserInfo(userInfo); // 저장 기능
		oracle.updateUserInfo(userInfo); // 수정 기능

	} // end of main

} // end of class
