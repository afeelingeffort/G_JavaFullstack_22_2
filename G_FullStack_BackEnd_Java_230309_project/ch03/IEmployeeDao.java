package ch03;

import java.util.ArrayList;

public interface IEmployeeDao {
	// crud  구조 
	void insert(EmployeeDTO dto);
	ArrayList<EmployeeDTO> select(int empNo);
	void select(String lastName);
	void update(String gender);
	void delete(int empNo);
	void delete(String lastName);
}
