package ch06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// 실제 DB에 접근해서 기능을 처리해주는 녀석
public class EmployeeDAO implements IEmployeeDAO {

	private DBHelper dbHelper;
	private Connection conn;
	// private Statement stmt;
	// private Statement보다 기능과 성능을 높일 수 있다.
	private PreparedStatement pstmt;
	private ResultSet rs;

	public EmployeeDAO() {
		// dbHelper.getConnection().createStatement().executeQuery(null);

		// DBHelper 객체를 가지고 오는 동작
		dbHelper = DBHelper.getInstance();
		// DBHelper에서 connection 객체를 가지고 오는 동작
		conn = dbHelper.getConnection();
	} // end of 생성자

	@Override
	public ArrayList<EmployeeDTO> showTitleEmpInfo(String title) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();

		// format 대신 '?'로 매핑
		String sql = " SELECT e.emp_no, e.first_name, e.last_name, t.title " + " FROM employees AS e "
				+ " INNER JOIN titles AS t " + " ON e.emp_no = t.emp_no " + " WHERE t.title = ? ";

		// prepareStatement 시작 번호는 1번부터 시작한다. ''<- 생략 가능
		// 그냥 ? 기반으로 사용 가능
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			// execute() : boolean 반환, executeQuery() : 객체 반환, executeUpdate() : int 반환
			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
//				System.out.println("rs.getString(\"emp_no\") : "+rs.getString("emp_no"));
				dto.setEmpNo(rs.getString("emp_no"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setTitle(rs.getString("title"));

				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public ArrayList<EmployeeDTO> salariesCount(String firstName, String lastName, String birthDate) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();

		String sql = " SELECT * , count(e.emp_no) AS count " + " FROM employees AS e " + " INNER JOIN salaries AS s "
				+ " ON e.emp_no = s.emp_no " + " WHERE first_name = ? AND last_name = ? AND birth_date =?";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, birthDate);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();

				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setBirthDate(rs.getString("birth_date"));
				dto.setCount(rs.getString("count"));

				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

} // end of class
