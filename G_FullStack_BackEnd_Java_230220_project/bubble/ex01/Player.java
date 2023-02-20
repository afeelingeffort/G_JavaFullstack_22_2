package ex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;

	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	public Player() {
		initData();
		setInitLayout();
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");

		left = false;
		right = false;
		up = false;
		down = false;
	}

	private void setInitLayout() {
		x = 55;
		y = 535;
		// 좌표 기반, 라벨의 크기를 지정해야 한다.
		setSize(50, 50);
		setLocation(x, y);
		// JLabel에 아이콘을 셋팅하는 메서드
		setIcon(playerR);
	}

	@Override
	public void left() {
		left = true;

		new Thread(new Runnable() {

			@Override
			public void run() {
				setIcon(playerL);
				x -= SPEED;
				setLocation(x, y);

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

	@Override
	public void right() {
		right = true;

		new Thread(new Runnable() {

			@Override
			public void run() {
				setIcon(playerR);
				x += SPEED;
				setLocation(x, y);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

	@Override
	public void up() {
		up = true;

		new Thread(new Runnable() {

			@Override
			public void run() {

			}
		}).start();
	}

	@Override
	public void down() {
		System.out.println("p down");
	}

}
