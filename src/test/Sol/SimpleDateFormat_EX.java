package test.Sol;

import java.util.Date;

public class SimpleDateFormat_EX {

	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat SI = new SimpleDateFormat("yyyy년 MM월 dd일 e요일 HH시 mm분");
		String SC = date.toString();
		
		
	}

}
