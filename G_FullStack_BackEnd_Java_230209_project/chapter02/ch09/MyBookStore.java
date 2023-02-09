package ch09;

import java.util.Scanner;

/*
 * @author Teach
 * 북 객체를 관리하는 프로그램
 * C R U D ->구글링 정의 확인 
 */

public class MyBookStore {

	// main 함수
	public static void main(String[] args) {

		// 준비물
		Scanner scn = new Scanner(System.in);
		// 배열은 먼저 배열의 길이를 지정해주어야 한다.
		Book[] books = new Book[100];
		boolean flag = true;
		int lastIndexNumber = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		// todo 추후 삭제 예정
		// 임시 데이터
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다.", "김진명");
		books[2] = new Book("흐르는 강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로 리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");

		// 실행에 흐름 만들어보기
		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1. 저장 2. 전체조회 3. 선택조회 4. 전체삭제 0. 종료");
			String selectedNumber = scn.nextLine();

			if (selectedNumber.equals(SAVE)) {
				// 저장
				lastIndexNumber = save(scn, books, lastIndexNumber);
				
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				// 전체 조회
				readAll(books);

			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				// 선택 조회
				readByTitle(scn, books);

			} else if (selectedNumber.equals(DELETE_ALL)) {
				// 전체 삭제
				deleteAll(books);
				
			} else if (selectedNumber.equals(END)) {
				// 종료
				System.out.println(">종료하기<");

				flag = false;
			} else {
				System.out.println("잘못된 입력 값입니다. \n 다시 선택 바람");
			}
		}

	} // end of main

	// 전체 조회하기 기능
	public static void readAll(Book[] books) {
		System.out.println(">전체 조회하기<");
		for (int i = 0; i < books.length; i++) {
			// 타이틀, 이름
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
			}
		}
		System.out.println();
	}

	// 선택 조회하기 기능
	public static void readByTitle(Scanner scn, Book[] books) {
		System.out.println(">선택 조회하기<");
		System.out.println(">>책 제목을 입력해주세요<<");
		String bookTitle = scn.nextLine();

		boolean isFind = false;
		for (int i = 0; i < books.length; i++) {
			// 타이틀, 이름
			if (books[i] != null) {
				if (books[i].getTitle().equals(bookTitle)) {
					// 찾았다
					System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
					isFind = true;
					break;
				}
			}
		}

		if (isFind == false) {
			System.out.println("없는 책입니다.");
		}
	}

	// 전체 삭제하는 기능
	public static void deleteAll(Book[] books) {
		System.out.println(">전체 삭제하기<");

		for (int i = 0; i < books.length; i++) {
			// 타이틀, 이름
			if (books[i] != null) {
				books[i] = null;
			}
		}
	}
	
	//저장하기 기능
	public static int save(Scanner scn, Book[] books, int lastIndexNumber) {
		System.out.println(">저장하기<");
		System.out.println("책 제목을 입력하세요.\n");
		String bookTitle = scn.nextLine();
		System.out.println("책 저자 이름을 입력하세요.\n");
		String bookAuthor = scn.nextLine();

		books[lastIndexNumber] = new Book(bookTitle, bookAuthor);
		lastIndexNumber++;
		System.out.println(bookTitle + "책을 저장했습니다.");
		return lastIndexNumber;
	}
	
} // end of class
