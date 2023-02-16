package ch05;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageMove extends JFrame implements Movable {

	private JLabel imageLabel;
	private int labelImageX;
	private int labelImageY;

	public ImageMove() {
		initData();
		setInitLayout();
		addEventListener();
		labelImageX = 300;
		labelImageY = 300;
	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		imageLabel = new JLabel(new ImageIcon("images/image2.png"));
		imageLabel.setSize(200, 200);

	}

	private void setInitLayout() {
		add(imageLabel);
		setLayout(null);
		imageLabel.setLocation(300, 300);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// 현재 이벤트가 일어난 시점에 x, y 좌표값을 확인
//				int currentX = labelText.getX();
//				int currentY = labelText.getY();

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});

	}

	@Override
	public void left() {
		if (0 < labelImageX) {
			int x = labelImageX -= 30;
			int y = labelImageY;

			imageLabel.setLocation(x, y);
		}
	}

	@Override
	public void right() {
		if (600 > labelImageX) {
			int x = labelImageX += 30;
			int y = labelImageY;

			imageLabel.setLocation(x, y);
		}
	}

	@Override
	public void up() {
		if (-10 < labelImageY) {
			int x = labelImageX;
			int y = labelImageY -= 30;

			imageLabel.setLocation(x, y);
		}

	}

	@Override
	public void down() {
		if (550 > labelImageY) {
			int x = labelImageX;
			int y = labelImageY += 30;

			imageLabel.setLocation(x, y);
		}
	}

	public static void main(String[] args) {
		new ImageMove();
	}
}
