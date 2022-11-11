package test.ch05;

import java.util.Calendar;

public class WeekEx {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();

		// 요일을 숫자로 얻는다.
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
//		System.out.println(week);
		
		//숫자를 열거 상수로 변환해서 변수에 대입.
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATHURDAY; break;
		}
		if(today == Week.SUNDAY) {
			System.out.println("일요일 입니다.");
		}
		else {
			System.out.println("일요일이 아닙니다.");
		
		}
		
	}

}
