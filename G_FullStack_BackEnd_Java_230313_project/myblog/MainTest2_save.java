package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

/*
 * 블로그에 글쓰는 기능
main → BlogController (블로그에 글이 하나도 없으면 알려주는 역할같은 거) → BlogService 
→ BlogDao(IBlogDao) → Mysql
*/

public class MainTest2_save {

	// main 함수
	public static void main(String[] args) {

//		UserDTO dto = new UserDTO("티모", "5678", "b@nate.com", "부산");

		UserController userController = new UserController();
		BlogController blogController = new BlogController();

		// 로그인 성공
		UserDTO loginUser = userController.requestSignIn("티모", "5678");
		System.out.println("userId : " + loginUser.getId());


		if (loginUser.getId() != 0) {
			int response = blogController.reqSaveBoard("MVC 패턴의 이해2", "Model-View-Controller", loginUser.getId());
			if (response == 0) {
				System.out.println("글쓰기에 실패하였습니다.");
			} else {
				System.out.println("글쓰기에 성공하였습니다.");
			}
		}

		// id, title, content, readCount, userId
		// title, content, userId -> 1. String으로 하나씩 지정, 2. 클래스를 만들어서 넘기는 방법

	} // end of main

} // end of class
