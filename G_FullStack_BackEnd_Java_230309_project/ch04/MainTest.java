package ch04;

public class MainTest {

	// main 함수
	public static void main(String[] args) {
		// 데이터 베이스에 접근해서 memberTBL에 대한 정보
		// 데이터 베이스에 접근해서 userTBL에 대한 정보

		UserDAO userDAO = new UserDAO();
		// delete() 확인
		// 자식 테이블에 데이터를 먼저 삭제하고 부모테이블에 정보를 삭제할 수 있다.
		// 이승기는 구매 테이블 이력이 남아있기 때문에 유저테이블에서 바로 삭제할 수 없다.
		boolean isDelete = userDAO.delete("이승기");
		System.out.println("isDelete : " + isDelete);
		if(isDelete == false) {
			System.out.println("구매테이블에 이력이 남아 있을 수 있습니다.");
		}

		// insert() 확인
//		UserDTO insertDto = new UserDTO("", "2020", "제주", "010-1234-1234");
//		int rowCount = userDAO.insert(new UserDTO("아이즈원", "2020", "경기도", "010-1234-1234"));

//		System.out.println("rowCount : " + rowCount);

		// update() 확인
//		UserDTO dto = new UserDTO("이순신", "1995", "부산", "010-2222-2222");
//		int updateRowCount = userDAO.update(dto, dto.getUserName());
//		System.out.println("updateRowCount : " + updateRowCount);

		// select() 확인
//		ArrayList<UserDTO> list = userDAO.select();
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getUserName());
//			System.out.println(list.get(i).getBirthYear());
//			System.out.println(list.get(i).getAddr());
//			System.out.println(list.get(i).getMobile());
//			System.out.println("-----------------------");
//		}

	} // end of main

} // end of class
