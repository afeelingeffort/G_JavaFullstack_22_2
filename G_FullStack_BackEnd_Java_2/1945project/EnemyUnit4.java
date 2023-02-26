package project_list;

import java.util.Random;

import javax.swing.ImageIcon;

public class EnemyUnit4 extends Enemy {
	
	AirplaneFrame mContext;
	
	// 생성자
	public EnemyUnit4(AirplaneFrame mContext) {
		super(mContext);
		this.mContext = mContext;
		initData();
		setInitLayout();
		
		myIndex = enemyCount;
		enemyCount++;
	}
	
	private void initData() {
		hp = 1;
		speed = 3; // 이동속도
		alive = 0; // 살아 있는 상태
		enemyImage = new ImageIcon("imagesProject/enemy4.png");
		
		// x 위치는 arrayMove 메서드에서
		
		// 초기 y 위치는 일단 고정 (임시)
	}
	
	private void setInitLayout() {
		setSize(100, 100);
		// 다른 메서드에서 setLocation(x, y);
		setIcon(enemyImage);
	}
	
}
