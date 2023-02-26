package project_list;

import javax.swing.ImageIcon;

public class EnemyUnit1 extends Enemy {

	AirplaneFrame mContext;

	public EnemyUnit1(AirplaneFrame mContext) {
		super(mContext);
		this.mContext = mContext;
		initData();
		setInitLayout();
		
		myIndex = enemyCount;
		enemyCount++;
	}

	public void initData() {
		hp = 4;
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
						Thread.sleep(30);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

}
