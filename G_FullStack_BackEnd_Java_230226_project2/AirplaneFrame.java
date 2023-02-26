package project;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//처음엔 BackgroundPlayerService가 잘 실행되는데
//적군 비행기에 맞거나 불릿에 맞으면 BackgroundPlayerService를 벗어나서 ArrayOutOfBoundsException이 발생합니다.

//메인 프레임
public class AirplaneFrame extends JFrame {

	// 메인 프레임을 자기자신 주소 (this)를 이용해 다른 클래스들과 접근하기
	private AirplaneFrame mContext = this;

	// 배경 흐르기
	ImageIcon backIc = new ImageIcon("imagesProject/stage1.png");
	Image backImg = backIc.getImage();
	int backY = -17200; // y좌표 초기화
	private JLabel backgroundMap;

	// 게임 시작 화면
	private JLabel gameStart;
	// 게임 종료 화면
	private JLabel gameOver;

	// 필요 클래스 포함관계로 선언
	private Background background;
	private Time time;
	private Player player;
	private Enemy enemy;
	private EnemyBullet enemyBullet;
	private Item item;

	// 플레이어 목숨 개수 아이콘
	private Life life0;
	private Life life1;
	private Life life2;

	// 게임 종료 여부 : 객체 생성하지 않고 사용 가능하게 (0 : 시작 화면, 1 : 게임중, 2 : 종료)
	private int gameState = 0;

// 여러 적군 만들기
//	private Enemy[] enemies = new Enemy[10];

	// 생성자
	public AirplaneFrame() {
		initData();
		setInitLayout();
		addEventListener();
		mContext.getItem().setDown(false);

		new Thread(new BackgroundPlayerService(player)).start();
		new Thread(new BackgroundEnemyService(enemy)).start();

//		// 적군 배열 각각에 백그라운드서비스 적용
//		for (int i = 0; i < enemies.length; i++) {
//			new Thread(new BackgroundEnemyService(enemies[i])).start();			
//		}
	} // end of 생성자

	// 각 클래스들의 getter, setter를 만들어주어 mContext를 참조하여 값을 가져오거나 설정할 수 있다.
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public EnemyBullet getEnemyBullet() {
		return enemyBullet;
	}

	public void setEnemyBullet(EnemyBullet enemyBullet) {
		this.enemyBullet = enemyBullet;
	}

	public int getGameState() {
		return gameState;
	}

	public void setGameState(int gameState) {
		this.gameState = gameState;
	}

	public Life getLife0() {
		return life0;
	}

	public void setLife(Life life0) {
		this.life0 = life0;
	}

	public Life getLife1() {
		return life1;
	}

	public void setLife1(Life life1) {
		this.life1 = life1;
	}

	public Life getLife2() {
		return life2;
	}

	public void setLife2(Life life2) {
		this.life2 = life2;
	}

	public AirplaneFrame getmContext() {
		return mContext;
	}

	public void setmContext(AirplaneFrame mContext) {
		this.mContext = mContext;
	}

	public JLabel getBackgroundMap() {
		return backgroundMap;
	}

	public void setBackgroundMap(JLabel backgroundMap) {
		this.backgroundMap = backgroundMap;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Enemy getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}

	public void gameOver() {
		// setLocation주면 창이 이동함, setSize 창 크기
		add(gameOver);
	}

	// 생성자 메서드 1
	private void initData() {
		gameStart = new JLabel(new ImageIcon("imagesProject/GameTitle.gif")); // 게임시작 화면
		gameOver = new JLabel(new ImageIcon("imagesProject/GameOver.png")); // 게임오버 화면
		backgroundMap = new JLabel(new ImageIcon("imagesProject/backgroundservice.png")); // 백그라운드서비스

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스까지 닫힘.
		setSize(950, 950);

//		JPanel panel = new  MyPanel();

		// 각 클래스의 생성자에 mContext를 매개변수로 주어 접근이 가능하게 한다.
		background = new Background(mContext);
		player = new Player(mContext);
		enemy = new Enemy(mContext);
		life0 = new Life(mContext);
		life1 = new Life(mContext);
		life2 = new Life(mContext);
		item = new Item(mContext);

//		// 테스트
//		for (int i = 0; i < enemies.length; i++) {
//			enemies[i] = new Enemy(mContext);
//		}

	}

	// 생성자 메서드 2
	public void setInitLayout() {
		setLayout(null); // 좌표기반
		setResizable(false); // 창 크기 조절 기능( 거짓 )
		setLocationRelativeTo(null); // JFrame 가운데 배치
		setVisible(true);

		// 게임 종료 여부 : 객체 생성하지 않고 사용 가능하게 (0 : 시작, 1 : 게임중)
		if (gameState == 0) {
			setContentPane(gameStart);
		} else if (gameState == 1) { // 시작, 종료가 아닌 게임 실행중인 상태
			setContentPane(new MyPanel()); // 배경 흐르기
			add(player);
			add(enemy);
			add(life0);
			add(life1);
			add(life2);

			// 아이템이 바로 내려오지 않도록 false로 초기화
			mContext.getItem().setDown(false);

		} else if (gameState == 2) {
			mContext.getPlayer().gameOver();
		}

//		// 여러 적군 만들기
//		for (int i = 0; i < enemies.length; i++) {
//			add(enemies[i]);
//		}
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// 37,38,39,40
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 여러 번 누르더라도 한 번만 추가될수 있도록 코드 추가
					if (player.isLeft() == false && player.isLeftWallCrash() == false) {
						player.left();
					}
					break;
				case KeyEvent.VK_RIGHT:
					if (player.isRight() == false && player.isRightWallCrash() == false) {
						player.right();

					}
					break;
				case KeyEvent.VK_UP:
					if (!player.isUp() && !player.isUpWallCrash()) {
						player.up();
					}
					break;
				case KeyEvent.VK_DOWN:
					if (player.isDown() == false && player.isDownWallCrash() == false) {
						player.down();
					}
					break;
				case KeyEvent.VK_SPACE:

					break;
				// 게임시작 : 엔터키
				case KeyEvent.VK_ENTER:
					gameState = 1;
					setInitLayout(); // 엔터키를 누르면 게임 실행중인 상태가 됨
					time = new Time();
					add(time.timeLabel); // 타임 생성 후 추가

					if (player.getAlive() == 1) {

						new AirplaneFrame();
					}
					break;
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽 버튼을 떼면 player는 멈춤
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					player.setRight(false);
					break;
				case KeyEvent.VK_UP:
					player.setUp(false);
					break;
				case KeyEvent.VK_DOWN:
					player.setDown(false);
					break;
				case KeyEvent.VK_SPACE:
					// 스페이스바 플레이어 공격
					player.attack();

					// 연속공격 안되게 하기 아직 보류
//					 Timer t = new Timer(true);
//					    TimerTask task1 = new TimerTask() {
//							
//							@Override
//							public void run() {
//								// TODO Auto-generated method stub
//								player.attack();
//							}
//						};
//						t.schedule(task1, 3000);

					break;
				}
			}

		});

	}

	// main 테스트 함수
	public static void main(String[] args) {
		new AirplaneFrame();
	} // end of main

	// 내부 클래스 MyPanel
	class MyPanel extends JPanel {

		// MyPanel 생성자
		public MyPanel() {

			// 키 이벤트 포커스, 컴포넌트가 포커스를 받을 수 있도록 설정
			setFocusable(true);

			// Thread 익명함수
			new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						backY++; // 배경이 아래에서 위로 흐르도록 함
						repaint(); // 다시 그리기
						try {
							Thread.sleep(7); // 0.007초
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}

				}
			}).start();

		}

		// 그림을 그려주는 메서드 paintComponent()
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			// g.drawImage(그릴 컴포넌트, X좌표, Y좌표, 너비, 높이, 자기자신)
			g.drawImage(backImg, -10, backY, 950, 18327, this);

			// Life클래스의 목숨 3개 각각 위치 지정
			life0.setLocation(20, 10);
			life1.setLocation(60, 10);
			life2.setLocation(100, 10);

			// Time클래스의 timeLabel을 참조하여 x : 830, y : 20에 위치 지정
			time.timeLabel.setLocation(830, 20);
			
			gameOver.setLocation(250, 200);

		} // end of paintComponent

	} // end of MyPanel class

} // end of class
