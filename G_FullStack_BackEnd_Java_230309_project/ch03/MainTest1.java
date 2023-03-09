package ch03;

import java.util.ArrayList;

public class MainTest1 {

		
	public static void main(String[] args) {
		// 디비 접근해서 기능 수하하는 녀석은 ????           
		EmployeeDao employeeDao = new EmployeeDao();
		ArrayList<EmployeeDTO> list = employeeDao.select(10004);
		
		//SWING 화면일 경우라면
		for(int i= 0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	} //end of main

} //end of class
