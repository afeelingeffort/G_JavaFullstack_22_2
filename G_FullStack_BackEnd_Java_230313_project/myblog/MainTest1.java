package com.tenco.blog;

import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest1 {

	// main 함수
	public static void main(String[] args) {

		// 회원가입 진행을 mysql 서버까지 보내야 함.
		// 사용자 정보 저장
		UserDTO userDTO = new UserDTO("홍길동", "5678", "b@nate.com", "부산");

		UserController userController = new UserController();
		// String result = userController.requestSignUP(userDTO, "localhost");
		// System.out.println(result);

		// 로그인 요청
		// 아이디, 비밀번호
		UserDTO responseUser = userController.requestSignIn(userDTO.getUserName(), userDTO.getPassword());
		if (responseUser == null) {
			System.out.println("로그인에 실패했습니다.");
		} else {
			System.out.println("당신은 인증된 유저가 맞습니다. 로그인 성공");
		}
		

	} // end of main

} // end of class
