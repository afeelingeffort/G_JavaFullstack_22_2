package ex10;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// ***** 자바 프로그램 중 main함수를 가지는 클래스는
// 프로그램에서 사용하는 모든 참조값을 알 수 있다.(접근할 수 있다.) *****
public class BubbleFrame extends JFrame {

	// this : 주소값을 mContext에 담아둠
	private BubbleFrame mContext = this;

	private JLabel backgroundMap;
	private Player player;
	private Enemy enemy;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();

		// player 메모리에 올라간 상태이다.
		// 약속) run 메서드 안에 동작을 처리한다.
		new Thread(new BackgroundPlayerService(player)).start();
	}
	
	public Player getPlayer() {
		return this.player;
	}

	public Enemy getEnemy() {
		return enemy;
	}
	
	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);

		// 1. 부모의 주소값을 자식 객체한테 던져주면 된다. - 사용
		// 2. 콜백 메서드를 활용해서 구현할 수 있다.
		player = new Player(mContext);

		// 적군 생성
		enemy = new Enemy();
	}
	
	private void setInitLayout() {
		setLayout(null); // 좌표 기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치

		add(player);
		add(enemy);

		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 여러번 누르더라도 한번만 호출되게 방어적 코드 작성
					// if (!player.isLeft()) { 와 같음
					// 왼쪽으로 가고 있는 상태도 아니고, 벽에 부딪힌 것도 아니면 왼쪽으로 간다.
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
					// 플레이어가 up == false
					// 플레이어가 down == false
					if (!player.isUp() && !player.isDown()) {
						player.up();
					}

					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;
				case KeyEvent.VK_SPACE:
					// 1단계
					// player : ATTACK
					player.attack();
					break;
				}
			} // end of pressed

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽 버튼을 떼면 player는 멈춰야 해
					player.setLeft(false);
					break;

				case KeyEvent.VK_RIGHT:
					// 오른쪽 버튼을 떼면 player는 멈춰야 해
					player.setRight(false);
					break;
				case KeyEvent.VK_UP:

					break;
				case KeyEvent.VK_DOWN:

					break;
				}

			}
		});
	}

	// ***** 자바 프로그램 중 main함수를 가지는 클래스는
	// 프로그램에서 사용하는 모든 참조값을 알 수 있다.(접근할 수 있다.) *****
	// 테스트 코드
	public static void main(String[] args) {
		new BubbleFrame();
	} // end of main

} // end of class
