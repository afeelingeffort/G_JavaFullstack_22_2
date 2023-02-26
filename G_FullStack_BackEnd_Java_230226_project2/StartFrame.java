package project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartFrame extends JFrame {

	private JLabel gameStart;

	public StartFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		gameStart = new JLabel(new ImageIcon("imagesProject/GameTitle.gif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(950, 950);

	}

	private void setInitLayout() {
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

		setContentPane(gameStart);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// 37,38,39,40
				switch (e.getKeyCode()) {
				case KeyEvent.VK_ENTER:
					setVisible(false);

					new AirplaneFrame();
					dispose();
//					break;

				}

			}

		});

	}

	public static void main(String[] args) {
		new StartFrame();
	}
}
