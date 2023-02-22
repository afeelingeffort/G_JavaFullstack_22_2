package ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMain {

	// main 함수
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Map<String, String> phoneBook = new HashMap<>();
		// 샘플 데이터 넣기
		phoneBook.put("홍길동", "010-1234-5678");
		phoneBook.put("이순신", "010-2222-2222");

		while (true) {
			System.out.println("0. 종료  1. 저장  2. 전체 조회  3. 선택 조회  4. 선택 삭제  5. 전체 삭제");
			System.out.println("메뉴를 선택하세요.>");
			int menu = scn.nextInt();
			switch (menu) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				scn.close();
				return;
			case 1:
				System.out.print("이름을 입력하세요.>");
				String name = scn.next();
				System.out.print("전화번호를 입력하세요.>");
				String phoneNumber = scn.next();

				phoneBook.put(name, phoneNumber);
				System.out.println(name + "님의 전화번호가 저장되었습니다.");
				break;

			case 2:
				if (phoneBook.isEmpty()) {
					System.out.println("저장된 전화번호가 없습니다.");
				}

				for (String key : phoneBook.keySet()) {
					System.out.println(key + " : " + phoneBook.get(key));
				}
				break;

			case 3:
				if (phoneBook.isEmpty()) {
					System.out.println("저장된 번호가 없습니다.");
					break;
				}

				System.out.print("조회할 이름을 입력하세요.>");
				name = scn.next();
				// 이 부분 다시 보기
				if (phoneBook.containsKey(name)) {
					phoneNumber = phoneBook.get(name);
					System.out.println(name + "님의 전화번호는 " + phoneNumber + "입니다.");
				} else {
					System.out.println(name + "님의 전화번호가 존재하지 않습니다.");
				}

				break;

			case 4:
				if (phoneBook.isEmpty()) {
					System.out.println("저장된 전화번호가 없습니다.");
					break;
				}

				System.out.print("삭제할 이름을 입력해주세요.>");
				name = scn.next();
				if (phoneBook.containsKey(name)) {
					phoneBook.remove(name);
					System.out.println(name + "님의 전화번호가 삭제되었습니다.");
				} else {
					System.out.println(name + "님의 전화번호가 존재하지 않습니다.");
				}

				break;

			case 5:
				if (phoneBook.isEmpty()) {
					System.out.println("저장된 전화번호가 없습니다.");
					break;
				}

				phoneBook.clear();
				System.out.println("전체 전화번호가 삭제되었습니다.");

				break;

			default:
				System.out.println("잘못된 메뉴 선택입니다.");
				break;
			} // end of switch

		}

	} // end of main

} // end of class
