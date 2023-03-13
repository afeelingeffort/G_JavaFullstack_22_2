package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest3_delete {

	public static void main(String[] args) {

		//사용자 여부 확인
		UserController userController = new UserController();
		BlogController blogController = new BlogController();
		UserDTO loginUser = userController.requestSignIn("티모", "5678");
		System.out.println(loginUser);
		
		//main --> BlogController에 넘겨야 할 값 ?? 
		//해당 게시글에 pk값을 알아야 한다.
		//사용자에 대한 정보도 필요하다.(userId)
		
		// 5, 3
		blogController.requestBoardDelete(5, loginUser.getId());
		
	}

}
