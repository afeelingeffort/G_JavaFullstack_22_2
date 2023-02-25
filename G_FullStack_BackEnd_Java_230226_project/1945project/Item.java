package project;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bullet extends JLabel implements Moveable {

	// 메인프레임 접근
	private AirplaneFrame mContext;

	// 위치 상태
	private int x;
	private int y;

	// 움직임 상태
	private boolean up;

	// 불릿 상태 : 0 , 불릿이 터진 상태 : 1
//	private int state; // 다른 클래스에서 bullet의 state를 사용하지 않아서 주석 하였습니다.
	// 이미지
	private ImageIcon bullet;
	private ImageIcon boom;

//	private BackgroundBulletService backgroundBulletService;

	private Item item;

//	public int getState() {
//		return state;
//	}
//
//	public void setState(int state) {
//		this.state = state;
//	}

	// 생성자에서 메인프레임의 주소를 받아 호출할 수 있다.
	public Bullet(AirplaneFrame mContext) {
		this.mContext = mContext;

		initData();
		setInitLayout();
		initThread();

//		backgroundBulletService = new BackgroundBulletService(this);
	}

	// 생성자 메서드 1
	public void initData() {
		bullet = new ImageIcon("imagesProject/PlayerBullet1.png");
		boom = new ImageIcon("imagesProject/explosion.gif");
//		state = 0; // 불릿인 상태로 초기화
		up = false; // up이 false인 상태로 초기화
	}

	// 생성자 메서드 2
	public void setInitLayout() {
		// 불릿의 위치가 Player 중앙에서 나오도록 하기 위해 조정값
		x = mContext.getPlayer().getX() + 20;
		y = mContext.getPlayer().getY();

		setIcon(bullet);
		setSize(80, 60);
		setLocation(x, y);
	}

	// 생성자 메서드 3
	public synchronized void initThread() {
		new Thread(new Runnable() {
			public void run() {
				up();
			}
		}).start();
	}

	// 적군과 충돌한 상태
	public void crash() {
		// 1 : 적이 죽은 상태
		mContext.getEnemy().setAlive(1);
//		state = 1; // 불릿이 터진 상태
		mContext.remove(mContext.getEnemy()); // 적군 비행기를 지움
//		setIcon(boom);
//		mContext.getItem().setDown(true);
//		mContext.getItem().down();
//		mContext.repaint();

//		try {
//			Thread.sleep(1);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		setIcon(null);

	}

	public void item() {
		// item 객체를 생성해서 쓰레드 안 down()을 호출함
		item = new Item(mContext);
		item.initThread();
	}

//	@Override
//	public void left() {
//
//	}

//	@Override
//	public void right() {
//
//	}

	// up()이 true이면 실행된다.
	@Override
	public synchronized void up() {
		up = true;

		// true인 동안 불릿이 위로 나간다.
		while (true) {
			y--;
			setLocation(x, y);
			// 절댓값으로 보정값을 준다.
			if (Math.abs(x - mContext.getEnemy().getX()) < 50 && Math.abs(y - mContext.getEnemy().getY()) < 50) {
				// 적군이 죽은 상태 : 0 이면
				if (mContext.getEnemy().getAlive() == 0) {
					mContext.getEnemy().beattacked(); // 적군이 공격당한 메서드를 호출
					crash(); // 적군과 충돌한 상태 호출
					setIcon(boom); // 충돌 이미지
					item(); // 아이템 이미지
				}
			}

			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// y좌표가 0이면 불릿 아이콘을 없애고 실행을 멈춘다.
			// (위에 불릿 잔상 나오는 거 여기서 조정값 줘도 안 바뀜) y < 100, y < 50, y < 30, y < 15, y < -20
			if (y < -20) {
				setIcon(null);
				break;
			}

		} // end of while
	} // end of up

//	@Override
//	public void down() {
//
//	}

} // end of class
