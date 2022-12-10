package test.ch16.stream;

import java.io.*;

public class Write_EX {

	public static void main(String[] args) {
		try {
			// 출력 스트림
			FileOutputStream fo = new FileOutputStream("C:/Temp/test1.db"); // C 드라이브에 있는 Temp 폴더에 파일생성

			byte a = 10;
			byte b = 20;
			byte c = 30;

			fo.write(a); // 1byte 씩 버퍼에 모아놓는다
			fo.write(b);
			fo.write(c);

			fo.flush();// 버퍼에 있는 바이트를 한번에 출력하고 버퍼를 비운다 (test1.db에 작성된다)

			fo.close();// 출력 스트림은 반드시 닫아줘야한다 (Scanner를 닫는것처럼)

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
