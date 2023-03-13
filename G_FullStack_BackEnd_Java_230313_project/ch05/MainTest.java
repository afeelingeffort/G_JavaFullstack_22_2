package ch05;

// DAO란 ? 데이터베이스의 data에 접근하기 위한 객체 
// DTO란 ? 계층 간 데이터 교환을 하기 위해 사용하는 객체 (유저가 입력한 데이터를 DB에 넣는 과정)
// VO란 ? 값 오브젝트로써 값을 위해 쓰인다.
public class MainTest {

	public static void main(String[] args) {
		BuyDAO buyDAO = new BuyDAO();

		// delete()
		boolean isDelete = buyDAO.delete("이승기");
		System.out.println("isDelete : " + isDelete);
		if (isDelete == false) {
			System.out.println("구매테이블에 이력이 남아있을 수도");
		}

		// update()
//		BuyDTO dto = new BuyDTO("홍길동", "책", 50, 2);
//		int updateRowCount = buyDAO.update(dto, dto.getUsername(), dto.getProdName());
//		System.out.println("updateRowCount : " + updateRowCount);

		// insert()

//		int rowCount = buyDAO.insert(new BuyDTO("이순신", "010", 5000, 1));
//		System.out.println("rowCount : " + rowCount);

		// select()
//		ArrayList<BuyDTO> list = buyDAO.select();
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getUsername());
//			System.out.println(list.get(i).getProdName());
//			System.out.println(list.get(i).getPrice());
//			System.out.println(list.get(i).getAmount());
//			System.out.println("--------------------------");
//		}

	}

}
