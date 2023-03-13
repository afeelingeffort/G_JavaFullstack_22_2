package ch06;

import java.util.ArrayList;
import java.util.Iterator;

public class MainTest1 {

	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAO();

		ArrayList<EmployeeDTO> tmpList = employeeDAO.salariesCount("Georgi", "Facello", "1953-09-02");
		for (int i = 0; i < tmpList.size(); i++) {
			String firstName = tmpList.get(i).getFirstName();
			String lastName = tmpList.get(i).getLastName();
			String count = tmpList.get(i).getCount();

			System.out.println("firstName : " + firstName);
			System.out.println("lastName : " + lastName);
			System.out.println("count : " + count);

		}

	}

}
