package ch06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JFrame implements ActionListener {

	private JButton[] buttons;
	private JPanel panel;

	public Rainbow() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		buttons = new JButton[7];
	}

	// borderLayout CENTER, SOUTH
	private void setInitLayout() {
		add(panel);
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}
		setVisible(true);
	}

	private void addEventListener() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
		}
	}

	// 테스트
	public static void main(String[] args) {
		new Rainbow();
	} // end of main

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetButton = (JButton) e.getSource();

		if (targetButton.getText().equals(this.buttons[0].getText())) {
			// click1 == click1
			panel.setBackground(Color.red);
			System.out.println(targetButton.getText());
		} else if (targetButton.getText().equals(this.buttons[1].getText())) {
			panel.setBackground(Color.orange);
			System.out.println(targetButton.getText());
		} else if (targetButton.getText().equals(this.buttons[2].getText())) {

		}
	}

} // end of class
