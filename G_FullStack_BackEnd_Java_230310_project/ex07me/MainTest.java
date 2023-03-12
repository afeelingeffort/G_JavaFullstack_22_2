package ex07me;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {

		TravelDAO travelDAO = new TravelDAO();

		ArrayList<TravelDTO> tmpList = travelDAO.showTravelInfo("김");
		for (int i = 0; i < tmpList.size(); i++) {
			String city_name = tmpList.get(i).getCityName();
			String name = tmpList.get(i).getPersonName();

			System.out.println("city_name : " + city_name);
			System.out.println("name : " + name);
		}
	}

}
