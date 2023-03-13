package ex07me;

import java.util.ArrayList;

public interface ITravelDAO {
	
	//성이 김씨인 사람이 여행 간 곳과 날짜를 출력
	ArrayList<TravelDTO> showTravelInfo(String name);
}
