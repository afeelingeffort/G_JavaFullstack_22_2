package project;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
적 비행기가 죽으면 아이템을 랜덤한 값에 따라 밑으로 뿌림
그 아이템을 Player가 먹었을 때 ( fastIcon 먹으면 속도 2 증가, recoverItem 먹으면 목숨 1 증가)
*/

// Bullet 클래스에 적군과 충돌했을 때 아이템 객체를 new 하고 화면에 붙여야 됨
public class Item extends JLabel implements Moveable {

	// 메인프레임 접근
	private AirplaneFrame mContext;

	// 위치 상태
	private int x;
	private int y;

	// 움직임 상태
//	private boolean left;
//	private boolean right;
//	private boolean up;
	private boolean down;

	// 적군이 살아있는 상태 : 0, 죽었을 때 : 1
//	private int alive;

	// 이미지
	private ImageIcon fastIcon;
	private ImageIcon recoverIcon;

	// fastItem : 80 ~ 110, recoverItem : 50 ~ 79
	// 50보다 작으면 아이템 나오지 않음
	// itemChance : 1부터 110까지 난수 발생
	Random rd = new Random();
	int itemChance = rd.nextInt(110);
	int fastItemVal = 80; // fastItemVal 초기값 80
	int recoverItemVal = 50; // recoverItemVal 초기값 50

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	// 생성자에서 메인프레임의 주소를 받아 호출할 수 있다.
	public Item(AirplaneFrame mContext) {
		this.mContext = mContext;

		initData();
		setInitLayout();
		initThread();

		// 아이템이 죽은 적군 비행기 자리에서 나오게 함
		x = mContext.getEnemy().getX();
		y = mContext.getEnemy().getY();
	}

	// 생성자 메서드 1
	private void initData() {
		down = false; // down을 false로 초기화

		fastIcon = new ImageIcon("imagesProject/fastIcon.png");
		recoverIcon = new ImageIcon("imagesProject/recoverIcon.png");
	}

	// 생성자 메서드 2
	private void setInitLayout() {
		setSize(50, 50);
		setLocation(x, y);
	}

	// 생성자 메서드 3
	public void initThread() {
		new Thread(new Runnable() {
			public void run() {
				down();
			}
		}).start();
	}

	@Override
	public void down() {
		// 랜덤수로 받은 itemChance가 80 ~ 110인 경우 fastItem
		if (itemChance >= fastItemVal) {
			setIcon(fastIcon);
			setSize(100, 100);
			setLocation(x, y);
			// 랜덤수로 받은 itemChance가 50 ~ 79인 경우 recoverItem
		} else if (itemChance >= recoverItemVal) {
			setIcon(recoverIcon);
			setSize(100, 100);
			setLocation(x, y);

		}

		// down이 true이면 아이콘 나옴
		down = true;
		mContext.add(this);

		while (down) {
			setLocation(x, y++); // y에 ++ 하여 내려가게 함
//			System.out.println("2313123");
			// 절댓값으로 보정값을 줌
			if (Math.abs(x - mContext.getPlayer().getX()) < 50 && Math.abs(y - mContext.getPlayer().getY()) < 50) {
				setIcon(null); // 아이콘을 Player가 먹으면 아이콘 없앰

				// fastItem을 먹으면 플레이어의 속도가 2 증가
				if (itemChance >= fastItemVal) {
					mContext.getPlayer().setSpeed(2);
					down = false;
					return;

					// recoverItem을 먹으면 플레이어 목숨이 2일 때 목숨 1 증가
				} else if (itemChance >= recoverItemVal) {
					
					if (mContext.getPlayer().getLife() == 2) {
						mContext.getLife2().lifeUp();
						System.out.println("생명력 1번");

						// 목숨 1일 때 1증가
					} else if (mContext.getPlayer().getLife() == 1) {
						mContext.getLife1().lifeUp();
						System.out.println("생명력 2번째 ");

					}
					down = false;

				}

			} // end of if

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();

			// y좌표가 840이면 아이템 사라지게 함
			if (y == 840) {
				System.out.println("0999");
				setIcon(null);
				down = false;
				break;
			}

		} // end of while
	} // end of down
} // end of class