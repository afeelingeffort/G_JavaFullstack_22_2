package project;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Life extends JLabel {

	// 메인프레임 접근
	private AirplaneFrame mContext;

	// 위치 상태
	private int x;
	private int y;

	// 이미지
	private ImageIcon life;

	// 생성자에서 메인프레임의 주소를 받아 호출할 수 있다.
	public Life(AirplaneFrame mContext) {
		this.mContext = mContext;

		initData();
		setInitLayout();
	}

	// 생성자 메서드 1
	public void initData() {
		setSize(50, 50);
		setVisible(true);

		life = new ImageIcon("imagesProject/LifeCount.png");
	}

	// 생성자 메서드 2
	public void setInitLayout() {
		setIcon(life);
	}

	public void crash(Life life) {
		// 플레이어와 적 비행기가 충돌하면 목숨 아이콘 하나 지워짐
		setIcon(null);
		mContext.remove(mContext.getPlayer());
		mContext.repaint();
	}

	// 아이콘 먹으면 목숨 증가
	public void lifeUp() {
		setIcon(life);
	}
}