package project;

import java.awt.Frame;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	// 메인프레임 접근
	AirplaneFrame mContext;
	// 플레이어의 방향
	PlayerWay playerWay;

	// 위치 상태
	private int x; // 플레이어 x좌표
	private int y; // 플레이어 y좌표

	// 플레이어 생존 여부
	private int alive;

	// 아이콘
	private ImageIcon player;
	private ImageIcon bullet;
	private ImageIcon gost; // 적군 비행기나 적군 비행기 불릿에 맞았을 시
	private ImageIcon gameOver;

	// 플레이어 목숨 개수
	private int LIFE = 3;

	// 플레이어의 현재 움직임 상태 기록
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 플레이어의 공격
	private boolean attack;

	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	private boolean upWallCrash;
	private boolean downWallCrash;

	// 플레이어의 속도
	// 상수 선언 X : 아이템을 먹으면 속도가 빨라져야 하기 때문에 값이 바뀜
	private int speed = 4;
	private final int MAXSPEED = 10;

	public int getLife() {
		return LIFE;
	}

	public void setLife(int LIFE) {
		this.LIFE = LIFE;
	}

	public int getAlive() {
		return alive;
	}

	public void setAlive(int alive) {
		this.alive = alive;
	}

	public AirplaneFrame getmContext() {
		return mContext;
	}

	public void setmContext(AirplaneFrame mContext) {
		this.mContext = mContext;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ImageIcon getPlayer() {
		return player;
	}

	public void setPlayer(ImageIcon player) {
		this.player = player;
	}

	public ImageIcon getBullet() {
		return bullet;
	}

	public void setBullet(ImageIcon bullet) {
		this.bullet = bullet;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isUpWallCrash() {
		return upWallCrash;
	}

	public void setUpWallCrash(boolean upWallCrash) {
		this.upWallCrash = upWallCrash;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	public boolean isDownWallCrash() {
		return downWallCrash;
	}

	public void setDownWallCrash(boolean downWallCrash) {
		this.downWallCrash = downWallCrash;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed <= MAXSPEED) {
			this.speed += speed;
		}
	}

	public void gameOver() {
		setSize(100, 100);
	}

	// 생성자에서 메인프레임의 주소를 받아 호출할 수 있다.
	public Player(AirplaneFrame mContext) {
		this.mContext = mContext;

		initData();
		setInitLayout();
	}

	// 생성자 메서드 1
	public void initData() {
		player = new ImageIcon("imagesProject/BigPlane2.png");
		gost = new ImageIcon("imagesProject/PLANE2무적.png");
		gameOver = new ImageIcon("ImagesProject/GameOver.png");
	}

	// 생성자 메서드 2
	public void setInitLayout() {
		// x, y좌표 초기값 설정
		x = 470;
		y = 805;
		
		setSize(100, 70);
		setLocation(x, y);
		setIcon(player);
	}

	// left()가 true이면 실행된다.
	@Override
	public void left() {
		left = true;
		playerWay = PlayerWay.LEFT;

		// 쓰레드를 이용하여 left를 실행하는 동안 왼쪽(-)으로 이동한다.
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (left) {
					x -= speed;
					setLocation(x, y);

					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			} // end of run
		}).start();
	} // end of left

	// right()가 true이면 실행된다.
	@Override
	public void right() {
		right = true;
		playerWay = PlayerWay.RIGHT;

		// 쓰레드를 이용하여 right를 실행하는 동안 오른쪽(+)으로 이동한다.
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (right) {
					x += speed;
					setLocation(x, y);

					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	} // end of right

	// up()이 true이면 실행된다.
	@Override
	public void up() {
		up = true;
		playerWay = PlayerWay.UP;

		// 쓰레드를 이용하여 up을 실행하는 동안 위쪽(-)으로 이동한다.
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (up) {
					y -= speed;
					setLocation(x, y);

					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

	} // end of up

	// down()이 true이면 실행된다.
	@Override
	public void down() {
		down = true;
		playerWay = PlayerWay.DOWN;

		// 쓰레드를 이용하여 down을 실행하는 동안 아래쪽(+)으로 이동한다.
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (down) {
					y += speed;
					setLocation(x, y);

					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	} // end of down

//	public void space() {
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				while (attack) {
//					System.out.println("space");
//					setIcon(bullet);
//					bulletX += 10;
//					setLocation(bulletX, bulletY);
//					try {
//						Thread.sleep(3);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}).start();
//	}

	// 공격을 받았을 때
	public void beAttack() {
		// LIFE의 생명이 하나 줄어듦
		LIFE -= 1;

		// LIFE가 2개이면
		if (LIFE == 2) {
			setIcon(gost); // 적군 비행기나 적군 비행기 불릿에 맞았을 시 나오는 이미지
			mContext.getLife2().setIcon(null); // LIFE2 이미지 지움
			System.out.println("1번째 추락 ");

			// LIFE가 1개이면
		} else if (LIFE == 1) {
			setIcon(gost);
			mContext.getLife1().setIcon(null); // LIFE1 이미지 지움
			System.out.println("2번째 추락");

			// LIFE가 0개이면
		} else {
			setIcon(gost);
			mContext.getLife0().setIcon(null); // LIFE0 이미지 지움
			System.out.println("3번째 추락");

			// 게임 종료 결과 화면
			mContext.setGameState(2);
			mContext.gameOver();
			
//			new GameOverFrame();

			// AirplaneFrame()을 다시 생성해서 창이 한 번 더 뜸
//			new AirplaneFrame();
			Frame frame = new Frame();
//			mContext.dispose();
		}

//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		setIcon(player);
	}

	public void attack() {
		// 게임 중일 때만 공격
		if (mContext.getGameState() == 1) {
			// 불릿 객체를 생성하여 불릿이 나가도록 함
			Bullet bullet = new Bullet(mContext);
//			System.out.println("1010101");
			mContext.add(bullet);
		}
	}

} // end of class