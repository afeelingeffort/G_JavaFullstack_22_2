package ex09_1;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class LottoFrame extends JFrame {
	
	JButton button; 
	LottoRandomNumber lottoRandomNumber;  
	
	boolean isStart = false; 
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("로또게임");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("game start");
		lottoRandomNumber = new LottoRandomNumber();
	}
	private void setInitLayout() {
		add(button, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 그림을 그릴때 두가 구분 , 처음, 버튼 
		if(isStart == false) {
			g.drawString("게임을 실행해 주세요", 150, 150);
			return; 
		}
		
		// 6 정렬된 난수 값을 받음 !
		// 실행에 흐름을 사용하는 변수를 쓰면 값 초기화를 잘 확인하자. 
		int[] getNumbers = lottoRandomNumber.createNumber();
		
		int j=0;
		for(int i=0; i<getNumbers.length; i++) {
			g.drawString(getNumbers[i]+"", j+=100, 150);
		}
		
//		g.drawString(getNumbers[0] + "", 50, 150);
//		g.drawString(getNumbers[1] + "", 150, 150);
//		g.drawString(getNumbers[2] + "", 250, 150);
//		g.drawString(getNumbers[3] + "", 350, 150);
//		g.drawString(getNumbers[4] + "", 450, 150);
//		g.drawString(getNumbers[5] + "", 550, 150);
	}
	
	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 그림을 다시 그려라 
				isStart = true; 
				repaint();
			}
		});
	}
}