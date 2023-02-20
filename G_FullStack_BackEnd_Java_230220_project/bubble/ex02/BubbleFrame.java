package ex02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);

		player = new Player();
	}

	private void setInitLayout() {
		setLayout(null); // 좌표 기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치

		add(player);

		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.right();
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
				case KeyEvent.VK_DOWN:
					player.down();
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

	// 테스트 코드
	public static void main(String[] args) {
		new BubbleFrame();
	} // end of main

} // end of class
