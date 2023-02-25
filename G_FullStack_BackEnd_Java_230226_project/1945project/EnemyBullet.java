package project;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EnemyBullet extends JLabel implements Moveable {

	// 메인프레임 접근
	private AirplaneFrame mContext;

	// 위치 상태
	private int x;
	private int y;

	// 움직임 상태
	private boolean down;

	// 생존 여부 (살아 있음 : 0, 죽음 : 1)
	private int state;

	// 공격 횟수
	private int attackCount;

	// 이미지
	private ImageIcon enemyBullet;
	private ImageIcon boom;
	private ImageIcon player;

	// 백그라운드 서비스
	private BackgroundEnemyBulletService backgroundenemyBulletService;

	// 생성자에서 메인프레임의 주소를 받아 호출할 수 있다.
	public EnemyBullet(AirplaneFrame mContext) {
		this.mContext = mContext;

		// backgroundenemyBulletService 생성
		backgroundenemyBulletService = new BackgroundEnemyBulletService(this);

		initData();
		setInitLayout();
		initThread();
	}

	// 생성자 메서드 1
	public void initData() {
		enemyBullet = new ImageIcon("imagesProject/bullet4.png");
		boom = new ImageIcon("imagesProject/explosion.gif");
		player = new ImageIcon("imagesProject/BigPlane2.png");

		state = 0; // 살아있는 상태로 초기화
		attackCount = 1; // 1로 계속 초기화
//		mContext.getPlayer().setIcon(player); // 메인프레임에서 생성해주어서 주석하였습니다. 
	}

	// 생성자 메서드 2
	public void setInitLayout() {
		// 적군 비행기 정중앙에서 불릿이 나오도록 보정값
		x = mContext.getEnemy().getX() + 30;
		y = mContext.getEnemy().getY() + 50;

		setIcon(enemyBullet);
		setSize(100, 100);
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

	public ImageIcon getEnemyBullet() {
		return enemyBullet;
	}

	public void setEnemyBullet(ImageIcon enemyBullet) {
		this.enemyBullet = enemyBullet;
	}

	// 플레이어가 한 번에 죽는 현상 방지
	public void crash() {
//      Player player = new Player(mContext);

		// attatckCount가 1일 때
		if (attackCount == 1) {
			// attackCount 초기값이 1이니 -- 하여 플레이어가 한번에 죽는 현상을 방지
			attackCount--;
			mContext.getPlayer().beAttack(); // 플레이어가 공격당하는 메서드 호출
			System.out.println("공격?");
//			setIcon(null); 
			// Player의 목숨이 0이면
			if (mContext.getPlayer().getLife() == 0) {
				setIcon(boom); // 폭발 이미지
				state = 1; // 죽은 상태
				mContext.remove(mContext.getPlayer()); // 플레이어 이미지 삭제
			}
		}

	}

	@Override
	public void left() {

	}

	@Override
	public void right() {

	}

	@Override
	public void up() {

	}

	// down()이 true이면 실행된다.
	@Override
	public void down() {
		down = true;

		// true인 동안 불릿이 아래로 나감
		while (true) {
			y++;
			setLocation(x, y);
			// 절댓값으로 보정값을 준다.ㄴ
			if (Math.abs(x - mContext.getPlayer().getX() - 40) < 50 && Math.abs(y - mContext.getPlayer().getY()) < 50) {
				//플래이어의 목숨이 0이면 crash()
				if (mContext.getPlayer().getAlive() == 0) {
					crash();
				}
			}
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
			// 화면 밖으로 총알이 나가면 사라짐
			if (y == 840) {
				setIcon(null);
			}
		}

	}
}