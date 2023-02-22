package ch04;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class PhoneBookMain {

	// main 함수
	public static void main(String[] args) {

		// while 0 종료 / 1 저장 / 2 전체조회 / 3 선택조회 / 4 선택삭제 / 5 전체 삭제
		// tip -> 데이터 입력
		// 샘플 데이터 만들어서 활용
		Scanner scn = new Scanner(System.in);
		String userInput = "-1";
		System.out.println(">>기능을 선택해주세요<<");
		
		while (userInput != "0") {
			System.out.println("0 종료 / 1 저장 / 2 전체조회 / 3 선택조회 / 4 선택삭제 / 5 전체 삭제");
			userInput = scn.nextLine();

			HashMap<String, String> phoneBook = new HashMap<>();
			
			phoneBook.put("홍길동", "010-1234-5678");
			phoneBook.put("고길동", "010-4567-5678");
			phoneBook.put("둘리", "010-8765-4321");
			
			
			if (userInput.equals("1")) {
				System.out.println("이름을 입력해주세요.>");
				String name = scn.next();
				System.out.println("전화번호를 입력하세요.>");
				String phoneNumber = scn.next();

				phoneBook.put(name, phoneNumber);
				
			} else if (userInput.equals("2")) {
				System.out.println("저장한 내용을 전체 조회합니다.");
				for (String key : phoneBook.keySet()) {
					System.out.println("이름 : " + key);
					System.out.println("전화번호 : " + phoneBook.get(key));
				}

			} else if (userInput.equals("3")) {
				System.out.println("저장한 내용을 선택 조회합니다.");
				System.out.println("조회할 이름을 입력해주세요.>");
				String userName = scn.nextLine();
				
//				for (int i = 0; i < phoneBook.size(); i++) {
//					if (phoneBook.get(i).contains(userName)) {
//						System.out.println(phoneBook.get(i));
//					}
//				}
				
				for(Entry<String, String> entry:phoneBook.entrySet()) {
					if(phoneBook.get(entry).contains(userName)) {
						System.out.println("이름 : " + entry.getKey());
						System.out.println("전화번호 : " + entry.getValue());	
					}
				}

			} else if (userInput.equals("4")) {
				System.out.println("저장한 내용을 선택 삭제합니다.");
				System.out.println("선택 삭제할 이름을 입력해주세요.>");
				String userName = scn.nextLine();

				for (int i = 0; i < phoneBook.size(); i++) {
					if (phoneBook.get(i).contains(userName)) {
						System.out.println(phoneBook.remove(i));
					}
				}
				
			} else if (userInput.equals("5")) {
				System.out.println("저장한 내용을 전체 삭제합니다.");
				for(int i=0; i<phoneBook.size(); i++) {
					phoneBook.clear();					
				}

				System.out.println("전체 삭제되었습니다.");
			} else if (userInput.equals("0")) {
				break;
			}

		}
		System.out.println("프로그램 종료");

	} // end of main

} // end of class
