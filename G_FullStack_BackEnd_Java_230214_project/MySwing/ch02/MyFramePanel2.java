package ch02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFramePanel2 extends JFrame {
//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;
	
	private JButton[] buttons = new JButton[6];

	// 패널 : 컴포넌트들을 그룹화 시킬 수 있다. 즉 각각의 배체관리자를 지정할 수 있다.
	private JPanel panel1;
	private JPanel panel2;

	public MyFramePanel2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("패널추가 연습");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel1.setBackground(Color.red);
		panel2 = new JPanel();
		panel2.setBackground(Color.yellow);

		// 버튼 초기화
		for (int i = 0; i < 3; i++) {
			buttons[i] = new JButton("button" + (i + 1));
		}

		for (int i = 3; i < 6; i++) {
			buttons[i] = new JButton("button" + (i + 1));
		}
//		button1 = new JButton("button1");
//		button2 = new JButton("button2");
//		button3 = new JButton("button3");
//		button4 = new JButton("button4");
//		button5 = new JButton("button5");
//		button6 = new JButton("button6");
	}

	private void setInitLayout() {
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));

		// 루트 패널 기본 레이아웃 BorderLayout이다.
		// 하지만 추가적으로 만들어 사용하는 Panel은 기본 레이아웃이 FloLayout이다.
		for (int i = 0; i < 3; i++) {
			panel1.add(buttons[i]);
		}
//		panel1.add(button1);
//		panel1.add(button2);
//		panel1.add(button3);
		// panel1.setLayout(null);

		for (int i = 3; i < 6; i++) {
			panel2.add(buttons[i]);
		}
//		panel2.add(button4);
//		panel2.add(button5);
//		panel2.add(button6);

		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFramePanel2();
	} // end of main

} // end of class
