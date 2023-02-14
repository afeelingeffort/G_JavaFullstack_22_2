package ch02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyComponents extends JFrame {
	private JButton button1;
	private JLabel label; // 글자를 넣어서 화면에 띄울 수 있다.
	private JTextField textField; // 사용자한테 입력 값을 받을 수 있는 컴포넌트
	private JPasswordField passwordField; // 사용자 비번을 받는 컴포넌트
	private JCheckBox checkBox; // 체크박스

	public MyComponents() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("컴포넌트 확인");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("JButton");
		label = new JLabel("글자를 적는 컴포넌트");
		textField = new JTextField("아이디 입력", 20);
		passwordField = new JPasswordField("비밀번호 입력", 10);
		checkBox = new JCheckBox("동의");
	}

	private void setInitLayout() {
		add(button1);
		add(label);
		add(textField);
		add(passwordField);
		add(checkBox);
		
		setLayout(new FlowLayout());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyComponents();
	}
}
