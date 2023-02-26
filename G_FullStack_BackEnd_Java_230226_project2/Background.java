package project;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Background extends JLabel {

	// 메인프레임 접근
	AirplaneFrame mContext;

	private int x; // x좌표
	private int y; // y좌표
	private ImageIcon background;

	private boolean up; // 이미지 위쪽으로 움직임

//	private int speed = 4; // 사용하지 않음

	// 생성자에서 메인프레임의 주소를 받아 호출할 수 있다.
	public Background(AirplaneFrame mContext) {
		this.mContext = mContext;

		initData();
		setInitLayout();
	}

	// 생성자 메서드 1
	public void initData() {
		background = new ImageIcon("imagesProject/stage1.png");

		x = 0; // x좌표 초기화
		y = -17307; // y좌표 초기화 : 멤버변수에서 초기화 하여 사용해도 똑같음
	}

	// 생성자 메서드 2
	public void setInitLayout() {
		setSize(950, 18327);
		setLocation(x, y);
		setIcon(background);
	}

	public void up() {

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
//					y += 1000; 사용하지 않아도 잘 작동함 
					setLocation(x, y);

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	} // end of up

} // end of class
