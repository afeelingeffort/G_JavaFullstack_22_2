package ch04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {

		// List 계열
		List list0;
		// 순서가 있고(인덱스) 중복이 가능하다.

		ArrayList<Integer> list = new ArrayList<>(); // 자료구조 - 정수를 담을 수 있는 메모리 공간 선언
		ArrayList<Student> members = new ArrayList<>();

		// 값 추가 방법
		list.add(3); // 인덱스 0번 - 3
		list.add(null); // 인덱스 1번 - null
		list.add(100); // 인덱스 2번 - 100
		// 3 null 100
		list.add(1, 20); // 인덱스 1번 - 20
		// 3 20 null 100
		// ArrayList add(index, value) <-- 이 메서드는 끼워 넣기다.
		System.out.println(list.toString());
		System.out.println(list.size());

		// 값 삭제 방법
		list.remove(2); // 해당하는 요소에 접근해서 제거
		System.out.println(list.toString());
		System.out.println(list.size());
		// 매번 삭제하려면
		// list.clear(); // 전체 삭제
		System.out.println(list.toString());
		System.out.println(list.size());

		// 값을 화면에 출력하는 방법
		System.out.println("--------------------");
		System.out.println(list.get(2)); // 배열은 인덱스 연산처리, ArrayList는 .get()연산자를 호출
		System.out.println(list.get(0));
		// System.out.println(list.get(20));

		System.out.println("--------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("--------------------");
		for (int abc상관없음 : list) {
			System.out.println("변수명 아무거나 됨" + abc상관없음);
		}

		System.out.println("--------------------");
		// 값 검색 기능 사용해보기
		// 리스트 안에 값이 있는지 없는지 확인하기
		// 3, 20, 100 <--- 70
		// 70 --> int --> 자동으로 형변환, 클래스 타입으로 Integer
		// contains 요소 안에 있는지 없는지 판별 - true, false 반환
		System.out.println(list.contains(70));
		System.out.println(list.contains(100));

		// 100값이 몇 번째 인덱스 요소에 있니?
		// IndexOf
		System.out.println(list.indexOf(100));
		// 값이 있으면 해당하는 인덱스 번호를 리턴한다.
		// 만약 값이 없으면 무엇을 반환할까?
		System.out.println(list.indexOf(70)); 
		// 값이 없으면 -1을 반환한다.
		
		System.out.println("--------------------");
		//추가
		Iterator<Integer> iter = list.iterator(); //반복자 녀석으로 형변환 해줌 iterator()
		while(iter.hasNext()) {
			System.out.println("값 확인 방법 : "+iter.next());
		}
		
	}

}

class Student {

}