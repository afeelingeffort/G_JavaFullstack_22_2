package ch02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {

	public static void main(String[] args) {

		DBClient client = new DBClient();
		Connection conn = client.getConnection();

		try {
			Statement stmt = conn.createStatement();
			// 쿼리문 생성 후 실행
			String queryStr = "SELECT * FROM buytbl";
			ResultSet rs = stmt.executeQuery(queryStr); // 결과를 ResultSet에 담기

			// 결과를 뽑는 기술
			while (rs.next()) {
				String username = rs.getString("username");
				String prodName = rs.getString("prodName");
				int price = rs.getInt("price");
				int amount = rs.getInt("amount");

				System.out.println("id : " + username + "\t");
				System.out.println("name : " + prodName + "\t");
				System.out.println("hire_date : " + price + "\t");
				System.out.println("amount : " + amount + "\t");
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
