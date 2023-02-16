package ch09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import ex09.LottoRandomNumber;

public class LottoFrame extends JFrame implements ActionListener {

	// 화면 담당
	// 기능은 LottoRandomNumber 클래스에서 받아서 처리해보자

	JButton button;
	int[] lotto = new int[6];
	LottoRandomNumber lrn;

	public LottoFrame(int[] lotto) {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("로또게임");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("lotto start");
		lrn = new LottoRandomNumber();
	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(this);

	}

	public void paint(Graphics g) {
		super.paint(g);
		// g.setColor(Color.black);
		Font f = new Font("궁서체", Font.BOLD, 20);
		g.setFont(f);

		if (lotto[0] == 0) {
			// 게임 초기 상태
			g.drawString("로또 번호를 클릭하세요.", 180, 200);
			return;
		}

		for (int i = 0; i < lotto.length; i++) {
			int j = 50;
			g.drawString(lotto[i] + "", j += 50, 200);
		}

		int[] getNumbers = lrn.createNumber();

		int j=0;
		for(int i=0; i<getNumbers.length; i++) {
			g.drawString(getNumbers[i]+"", j+=100, 150);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("게임 시작");
		repaint();
	}
}
