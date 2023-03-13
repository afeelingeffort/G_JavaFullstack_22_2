package ex06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO implements IEmployeeDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public EmployeeDAO() {
		dbHelper = DBHelper.getInstance();
		conn = dbHelper.getConnection();
	}

	@Override
	public ArrayList<EmployeeDTO> showTitleEmpInfo(String title) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();

		String sql = " SELECT e.emp_no, e.first_name, e.last_name, t.title " + " FROM employees AS e "
				+ " INNER JOIN titles AS t " + " ON e.emp_no = t.emp_no " + " WHERE t.title = ? ";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();

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

}
