package ch06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest2 {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("data.txt");

			// 보조 기반 스트림
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeByte('A');
			dos.writeUTF("hello world");
			dos.writeInt(100);
			dos.flush(); // 잊지마

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("data2.txt");

			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readByte());
			System.out.println(dis.readUTF());
			System.out.println(dis.readInt());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of main

}
