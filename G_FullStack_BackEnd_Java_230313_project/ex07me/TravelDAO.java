package ex07me;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TravelDAO implements ITravelDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public TravelDAO() {
		dbHelper = DBHelper.getInstnace();
		conn = dbHelper.getConnection();
	}

	@Override
	public ArrayList<TravelDTO> showTravelInfo(String name) {
		ArrayList<TravelDTO> list = new ArrayList<>();

		String sql=" SELECT c.city_name, p.person_name, t.trip_date "
				+ " FROM travel AS t "
				+ " INNER JOIN person AS p "
				+ " ON t.person_id = p.person_id "
				+ " INNER JOIN city AS c "
				+ " ON t.city_id = c.city_id "
				+ " WHERE p.person_name LIKE ? ";
//		String user = "김";
//		String keyword = "%" + user + "%";


		
//		StringBuffer sql = new StringBuffer();
//
//		sql.append(" SELECT c.city_name, p.person_name" 
//				+ " FROM travel AS t "
//				+ " INNER JOIN person AS p " 
//				+ " ON t.person_id = p.person_id " 
//				+ " INNER JOIN city AS c "
//				+ " ON t.city_id = c.city_id " 
//				+ " WHERE p.person_name LIKE ? ");

		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, "%" + name + "%");
//			pstmt.setString(2, date);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				TravelDTO dto = new TravelDTO();

				dto.setCityName(rs.getString("city_name"));
				dto.setPersonName(rs.getString("person_name"));
//				dto.setTrip_date(rs.getString("trip_date"));

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
