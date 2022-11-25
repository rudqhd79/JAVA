package test.ch11.String;

import java.util.StringTokenizer;

public class StringToken_EX {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍, 박연수";

		String[] arr = data1.split("&, ");
		for (String token : arr) {
			System.out.println(token);
		}

		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");

		// st가 토큰을 더 가지고 있는지?
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);

		}
	}
}
