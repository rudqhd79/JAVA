package test.ch11.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToString_EX {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "자바";

		byte[] arr1 = data.getBytes(); // utf-8 로 인코딩
		System.out.println(Arrays.toString(arr1)); // 배열을 문자열로 바꾼다

		String str1 = new String(arr1, "UTF-8"); // utf-8로 디코딩 (UTF-8은 생략가능)
		System.out.println(str1);

	}

}
