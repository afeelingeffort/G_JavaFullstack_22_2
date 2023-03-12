package ex06;

import java.util.ArrayList;

public interface IEmployeeDAO {
	
	// 해당 직함의 이름을 입력 받아 직원을 출력
	ArrayList<EmployeeDTO> showTitleEmpInfo(String title);
}
