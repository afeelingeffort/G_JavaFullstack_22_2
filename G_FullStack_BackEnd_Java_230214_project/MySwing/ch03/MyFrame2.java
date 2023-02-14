package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame{
	
	//내부 클래스를 활용해서
	//JPanel를 상속 받고 paint 메서드로 집 그림을 그려주세요.
	//집 그림을 그려주세요
	//cafe --> 결과 사진 올려주세요
	
	MyDrawPanel drawPanel;
	
	class MyDrawPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(300, 300, 300, 320);
			g.drawLine(300, 300, 400, 250);
			g.drawLine(600, 300, 500, 250);
			g.drawRect(350, 100, 200, 150);
			g.drawLine(350, 100, 450, 50);
			g.drawLine(300, 500, 350, 50);
		}
	}
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("집 그리기");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drawPanel = new MyDrawPanel();
	}
	
	private void setInitLayout() {
		add(drawPanel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame2();
	}
}
