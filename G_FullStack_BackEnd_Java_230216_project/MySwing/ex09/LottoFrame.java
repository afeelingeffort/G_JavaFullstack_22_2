package ex09;

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

		if (isStart == false) {
			g.drawString("게임을 실행해주세요.", 150, 150);
			return;
		}

		// 6 정렬된 난수 값을 받음
		// 실행에 흐름을 사용하는 변수를 쓰면 초기화를 잘 확인하자.
		int[] getNumbers = lottoRandomNumber.createNumber();

		int j=0;
		for(int i=0; i<getNumbers.length; i++) {
			g.drawString(getNumbers[i]+"", j+=100, 150);
		}
	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				isStart = true;
				repaint();
			}
		});
	}

}
