package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame {

	// 1단계 JButton 2개 생성
	// 배치관리자 FlowLayout 멤버 변수로 선언
	// 화면에 Component를 그려주세요.
	private JButton button1;
	private JButton button2;

	private FlowLayout fl;

	public FlowLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("hi");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		fl = new FlowLayout(FlowLayout.RIGHT, 30, 30);
	}

	private void setInitLayout() {
		setLayout(fl);
		add(button1);
		add(button2);
	}

	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
} // end of class
