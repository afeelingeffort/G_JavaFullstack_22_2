package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 소켓 통신을 구현할 때 
// 1. 서버측, 클라이언트 측은 (통신을 통해서 데이터를 주고 받는다.)
// 서버측 만들 때 서버 소켓을 준비해야 한다.
// 소켓은 양 끝단에 포트번호를 달아야 한다.
// 한 대의 컴퓨터는 0 ~ 65335번까지 포트 번호를 사용할 수 있다.
// 그 중에 0 ~ 1023번 포트번호까지는 잘 알려진 포트번호라서 가능한 사용 안 하는 게 좋다.
public class ServerFile {
	// 클라이언트 연결만 받는 소켓
	ServerSocket serverSocket;

	// 실제 통신을 하는 소켓
	Socket socket;
	//
	BufferedReader bufferedReader;

	public ServerFile() {
		System.out.println(">> 1. 서버 소켓 시작 <<");

		try {
			// 서버 소켓을 포트 번호와 함께 생성
			serverSocket = new ServerSocket(11000);

			socket = serverSocket.accept(); // 클라이언트 접속 대기중
			System.out.println("2. 클라이언트 연결 완료");

			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String getMsg = bufferedReader.readLine();
			System.out.println("서버측에서 확인 : " + getMsg);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("여기에 코드가 내려왔나요?");

	} // end of 생성자

	// main 함수
	public static void main(String[] args) {
		new ServerFile();
	} // end of main

} // end of class
