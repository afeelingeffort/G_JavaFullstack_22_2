package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

//좌표 기반으로 컴포넌트들을 배치해보자
public class NoLayoutEx2 extends JFrame {

	// JButton <--

	private JButton[] buttons = new JButton[5];

	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("모양 만들기");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + (i + 1));
		}
		buttons[0].setSize(200, 200);
		buttons[1].setSize(200, 200);
		buttons[2].setSize(200, 200);
		buttons[3].setSize(200, 200);
		buttons[4].setSize(200, 200);
	}

	private void setInitLayout() {
		setLayout(null);

		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}
		buttons[0].setLocation(300, 300);
		buttons[1].setLocation(200, 200);
		buttons[2].setLocation(100, 300);
		buttons[3].setLocation(100, 100);
		buttons[4].setLocation(300, 100);

		setVisible(true);
	}

	public static void main(String[] args) {
		new NoLayoutEx2();

	} // end of main

} // end of class
