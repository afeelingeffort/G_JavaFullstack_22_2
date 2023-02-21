package ex05;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel {

	// 버블의 위치 상태
	private int x;
	private int y;

	// 버블의 움직임 방향 상태
	private boolean left;
	private boolean right;
	private boolean up;

	// 적군을 맞춘 상태 : 0 : 기본 물방울, 1 : 적을 가둔 물방울
	private int state;

	private ImageIcon bubble; // 기본 물방울 이미지
	private ImageIcon bubbled; // 적을 가둔 물방울 이미지
	private ImageIcon bomb; // 물방울이 터진 이미지
	
	private Player player;

	//버블은 Player에 의존하고 있다.
	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
	}

	private void initData() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");
		left = false;
		right = false;
		up = false;
		state = 0;
	}

	private void setInitLayout() {
		//플레이어가 있는 위치에 태어나야 한다.
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}
}
