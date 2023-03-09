package ch03;

public class EmployeeDTO {

	int empNo;
	String birthDate;
	String fisrtName;
	String lastName;
	String gender;
	String hireDate;

	public EmployeeDTO(int empNo, String birthDate, String fisrtName, String lastName, String gender, String hireDate) {
		super();
		this.empNo = empNo;
		this.birthDate = birthDate;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empNo=" + empNo + ", birthDate=" + birthDate + ", fisrtName=" + fisrtName + ", lastName="
				+ lastName + ", gender=" + gender + ", hireDate=" + hireDate + "]";
	}

} // end of class
