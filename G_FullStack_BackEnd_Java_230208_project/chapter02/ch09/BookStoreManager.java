package ch09;

import java.util.Scanner;

public class BookStoreManager {

	public static void main(String[] args) {

		// 책을 저장하는 기능을 만들고
		// 정보를 출력하는 프로그래밍 만들어주세요
		// 스캐너
		// 문자열
		// while문을 사용해서
		// CRUD에 개념
		// 1. 저장/ 2. 전체조회/ 3. 선택조회/ 4. 전체삭제/ 0.프로그램 종료

		Book[] book = new Book[2];
		Scanner scn = new Scanner(System.in);
		boolean flag = true;
		int index = 0;

//		index++;

		while (flag) {
			System.out.println("책 정보 프로그램");
			System.out.println("메뉴를 선택해주세요.>");
			System.out.println("1. 저장 \t2. 전체조회\t3. 선택조회\t4. 전체삭제\t0.프로그램 종료");
			String userInput = scn.nextLine();
			String title;
			String author;

			// 객체를 만들어서 배열에 만들어준다.
			if (userInput.equals("1")) {

				System.out.println("책 이름과 저자를 저장합니다.");
				System.out.println("책 이름을 입력해주세요.>");
				title = scn.nextLine();
				System.out.println("책 저자를 입력해주세요.>");
				author = scn.nextLine();

				book[index] = new Book(title, author);
				index++;

			} else if (userInput.equals("2")) {
				System.out.println("저장한 내용을 전체 조회합니다.");
				for (int i = 0; i < book.length; i++) {
					if (book[i] != null) {
						book[i].showInfo();
					}
				}
			} else if (userInput.equals("3")) {
				System.out.println("조회할 책을 선택해주세요.>");
				for (int i = 0; i < book.length; i++) {
					if (book[i] != null) {
						book[i].showInfo();
					}
				}
				
				int find = scn.nextInt();
				for (int i = 0; i < book.length; i++) {
					if (book[i] != null) {
						if (find == i) {
							book[i].showInfo();
						}
					}
				}
				//동적으로 
//				if (find == 0) {
//					book[0].showInfo();
//				} else if (find == 1) {
//					book[1].showInfo();
//				} else if (find == 2) {
//					book[2].showInfo();
//				} else {
//					System.out.println("잘못 입력하셨습니다.");
//				}

			} else if (userInput.equals("4")) {

				for (int i = 0; i < book.length; i++) {
					book[i] = null;
				}

				

				System.out.println("기록을 전체 삭제하셨습니다.");

			} else if (userInput.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			}

		}

		// 값을 비교하는 연산자 ==

//		String tmp="안녕";
//		if(tmp.equals("안녕")) {
//			System.out.println("같은 값 확인");
//		} else {
//			System.out.println("값이 달라요");
//		}
//		
//		if("반가워".equals(tmp)) {
//			System.out.println("같은 값 확인");
//		} else {
//			System.out.println("값이 달라요");
//		}
//		

	} // end of main

} // end of class
