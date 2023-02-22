package ex08;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel implements Moveable {

	// 버블에 위치 상태
	private int x;
	private int y;

	// 버블에 움직임 방향 상태
	private boolean left;
	private boolean right;
	private boolean up;

	// 적군을 맞춘 상태 : 0 기본, 1, (적을 가둔 물방울)
	private int state;

	private ImageIcon bubble; // 기본 물방울 이미지
	private ImageIcon bubbled; // 적을 가둔 상태 이미지
	private ImageIcon bomb; // 물방울이 터진 상태 이미지

	private Player player;
	
	private BackgroundBubbleService backgroundBubbleService;

	// 버블을 Player에 의존하고 있다.
	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
		backgroundBubbleService = new BackgroundBubbleService(this);
		initThread(); //initThread 호출 --> left() --> backgroundBubbleService.leftWall()
	}

	private void initData() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubled.png");
		bomb = new ImageIcon("images/bomb.png");
		left = false;
		right = false;
		up = false;
		state = 0;
	}

	private void setInitLayout() {
		// 플레이어가 있는 위치에 태어나야 한다.
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}

	private void initThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				if (player.getpWay() == PlayerWay.LEFT) {
					// 왼쪽 방향을 보고 있다.
					left();
				} else {
					right();
				}

			}
		}).start();
	}

	@Override
	public void left() {
		left = true;
		for (int i = 0; i < 400; i++) {
			x--;
			setLocation(x, y);
			// 체크 왼쪽 벽이야? --> break;
//			System.out.println(backgroundBubbleService.leftWall());
			if(backgroundBubbleService.leftWall()) {
				break;
			}
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of for
		up();

	}

	@Override
	public void right() {
		right = true;
		for (int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			if(backgroundBubbleService.rightWall()) {
				break;
			}
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of for
		up();

	}

	@Override
	public void up() {
		up = true;

		while (true) {
			y--;
			setLocation(x, y);
			
			if(backgroundBubbleService.topWall()) {
				break;
			}
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		clearBubble();
	}
	
	//메서드 행위(동사) -> (목적어)
	private void clearBubble() {
		try {
			Thread.sleep(3000);
			setIcon(bomb);
			//터진다음에 0.5초 다음에 그림을 지우기
			Thread.sleep(500);
			setIcon(null);
			repaint();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}

}