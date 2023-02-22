package ch04;

import java.util.HashMap;

public class MainTest2 {

	public static void main(String[] args) {
		//Map 자료구조를 이용해서 전화번호를 저장해주세요
		// 1 - String, String
		// 2 - String, Object(Person)
		
		//HashMap 생성 
		HashMap<String, String> phoneBook = new HashMap<>();
		phoneBook.put("홍길동", "010-1234-5678");
		phoneBook.put("고길동", "010-5431-2143");
		phoneBook.put("홍길동", "010-1234-5678");
		
		System.out.println(phoneBook); //key값은 중복 허용 안함
		
		//전화번호 검색
		String phoneNumber = phoneBook.get("홍길동");
		System.out.println(phoneNumber);
		
		HashMap<String, Object> map2 = new HashMap<>();
		
	}

}
