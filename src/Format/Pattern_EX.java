package Format;

import java.util.regex.Pattern;

public class Pattern_EX {

	/*
	 \d는 한개의 숫자 
	 02-222-2222
	 010-2222-2222
	  */
	
	
	public static void main(String[] args) {
		//\d{3, 4}의 의미는 3자리부터 4자리까지 들어온다는 것
		String regExp = "(010|02) - \\d{3, 4} - \\d{4}"; 	//패턴을 넣을 문자열, 전화번호 체크
		String data = "010-123-4567";
		
		//matches(패턴, 검증하고 싶은 데이터)
		boolean result = Pattern.matches(regExp, data);
		
		regExp = "\\w+@\\w+\\.\\w(\\.\\w+)?";
		data = "test@naver.com";
		
		result = Pattern.matches(regExp, data);
	}

}
