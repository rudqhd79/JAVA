package test.ch11.Date;

import java.util.Date; //  .*을 넣으면 유틸을 전부 다 가져온다는 뜻
import java.text.SimpleDateFormat;

public class Date_EX {

	public static void main(String[] args) {
		// new Date()를 통해 얻을 수 있는 것은 요일, 월, 일, 시간이다
		Date now = new Date();
		System.out.println(now); // 객체형
		String strNow1 = now.toString(); // Date안에 있는 것은 문자열이기 때문에 toString()을 써서 바꿔준다
		System.out.println(strNow1); // 문자형

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy."); // 포맷형태 객체생성
		String strNow2 = sdf.format(now); // Date객체를 넣어준다.
	}

}
