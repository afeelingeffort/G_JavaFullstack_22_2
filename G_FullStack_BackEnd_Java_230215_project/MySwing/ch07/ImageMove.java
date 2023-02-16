package ch07;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageMove extends JFrame implements Movable2 {

	private JLabel imageLabel;
	private int labelTextX;
	private int labelTextY;

	public ImageMove() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imageLabel=new JLabel(new ImageIcon("images/image10.png"));
		imageLabel.setSize(100,100);

	}

	private void setInitLayout() {
		getContentPane().add(imageLabel);

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

	public static void main(String[] args) {
		new ImageMove();
	}

	@Override
	public void left() {
		int x = labelTextX -= 30;
		int y = labelTextY;

		if (0 < labelTextX) {
			imageLabel.setLocation(x, y);
		}
	}

	@Override
	public void right() {
		int x = labelTextX += 30;
		int y = labelTextY;

		if (600 > labelTextX) {
			imageLabel.setLocation(x, y);
		}
	}

	@Override
	public void up() {
		int x = labelTextX;
		int y = labelTextY -= 30;

		if (0 < labelTextY) {
			imageLabel.setLocation(x, y);
		}
	}

	@Override
	public void down() {
		int x = labelTextX;
		int y = labelTextY += 30;

		imageLabel.setLocation(x, y);
		if (600 > labelTextY) {
			imageLabel.setLocation(x, y);
			System.out.println(imageLabel.getX());
		}
	}

}
