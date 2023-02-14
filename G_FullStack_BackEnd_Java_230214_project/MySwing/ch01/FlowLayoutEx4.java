package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//Frame 기능 사용하려면 어떤 클래스를 상속 받아야 하나요?
public class FlowLayoutEx4 extends JFrame {

	// 멤버 변수 선언할게요
	private JButton[] buttons = new JButton[5]; // 배열 선언 방법에 이해

	// 생성자는 메모리에 올라갈 때 처음 실행되는 코드
	// 구현부 안에서 순서도 중요
	public FlowLayoutEx4() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("배열활용");
		setSize(500, 500);
		// static 변수나 static 함수는 클래스 이름으로도 접근 가능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + (i+1));
		}
//		buttons[0] = new JButton("button1");
//		buttons[1] = new JButton("button2");
//		buttons[2] = new JButton("button3");
//		buttons[3] = new JButton("button4");
//		buttons[4] = new JButton("button5");
	}

	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		
		for(int i=0; i<buttons.length; i++) {
			//방어적 코드 작성 염두 !
			add(buttons[i]);
		}
//		add(buttons[0]);
//		add(buttons[1]);
//		add(buttons[2]);
//		add(buttons[3]);
//		add(buttons[4]);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx4();
	}

} // end of class
