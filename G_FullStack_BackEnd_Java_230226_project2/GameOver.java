package project;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GameOver extends JLabel {

	private AirplaneFrame mContext;

	private JLabel gameOver;
	private Enemy enemy;

	private int x;
	private int y;

	public GameOver(AirplaneFrame mContext) {
		this.mContext = mContext;

		initData();
		setInitLayout();
	}

	private void initData() {
		x = 10;
		y = 10;

		gameOver = new JLabel(new ImageIcon("imagesProject/GameOver2.png"));
		setSize(500, 500);
	}

	private void setInitLayout() {
		setLayout(null);
		setVisible(true);
	}

}
