package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {

	// 멤버 변수를 선언할 수 있는가
	// 배열을 활용할 수 있는가
	// 생성자 + 메서드 호출
	// for문을 활용할 수 있는가?
	// GUI 프로그램 익숙해지기

	private JButton[] buttons = new JButton[10];
	private FlowLayout fl;

	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("hi");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i] = new JButton("buttons"));
		}
		fl = new FlowLayout(FlowLayout.RIGHT, 30, 30);
	}

	private void setInitLayout() {
		setLayout(fl);
	}

	public static void main(String[] args) {
		new FlowLayoutEx3();
	}
} // end of class
