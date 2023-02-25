package project;

import javax.swing.ImageIcon;

public class EnemyUnit2 extends Enemy2{

	EnemyTestFrame2 mContext;

	public EnemyUnit2(EnemyTestFrame2 mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();
	}

	public void initData() {
		hp = 1;
		speed = 1;
		alive = 0;
		enemyImage = new ImageIcon("imagesProject/enemy1.png");
	}

	private void setInitLayout() {
		setSize(500, 500);
		setIcon(enemyImage);
	}

	@Override
	public void down(int speed) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				down = true;
				while (alive == 0) {
//					attack();
					y += speed;
					setLocation(x, y);
					try {
						Thread.sleep(80);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

}
