package ch02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFramePanel extends JFrame {
	private JButton button1;
	private JButton button2;

	// 패널 : 컴포넌트들을 그룹화 시킬 수 있다. 즉 각각의 배체관리자를 지정할 수 있다.
	private JPanel panel1;
	private JPanel panel2;

	public MyFramePanel() {
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
		button1 = new JButton("button1");
		button2 = new JButton("button2");
	}

	private void setInitLayout() {
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);

		// 루트 패널 기본 레이아웃 BorderLayout이다.
		// 하지만 추가적으로 만들어 사용하는 Panel은 기본 레이아웃이 FlowLayout이다.
		panel1.add(button1);
		// panel1.setLayout(null);

		panel2.add(button2);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFramePanel();
	} // end of main

} // end of class
