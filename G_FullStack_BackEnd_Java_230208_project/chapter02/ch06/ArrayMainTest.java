package ch06;

public class ArrayMainTest {

	//main함수
	public static void main(String[] args) {

		//배열이란
		//!연관된 데이터를 모아서 통으로 관리하기 위해서 사용하는 데이터 타입이다!
		//변수가 하나의 데이터를 저장하기 위한 것이라면
		//배열은 여러개의 데이터를 하나의 변수에 저장하기 위한 것이다.
		
		//배열을 선언할 때 몇 칸에 공간을 사용할지 먼저 지정해주어야 한다.
		int[] arr = new int[5];
		
		//네모칸안에 값을 넣는 방법 (인덱스 연산 값 할당)
		arr[0] = 1;
		arr[1] = 100;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 300;
		
		//값 확인하는 방법
		System.out.println(arr[2]);
		
	} //end of main

} //end of class
