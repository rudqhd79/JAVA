package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOp_EX2 {

	public static void main(String[] args) {
		//데이터 포맷 형태
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

		//2021년 1월 1일 0시 0분 0초
		LocalDateTime startDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
		System.out.println("시작일:  " + startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
		System.out.println("종료일:  " + endDateTime.format(dtf));
		
		if (startDateTime.isBefore(endDateTime)) {	//이전 날짜인지?
			System.out.println("진행 중 입니다.");
		}	else if (startDateTime.isEqual(endDateTime)) {	//같은 날짜인지?
			System.out.println("종료합니다.");
		} else if (startDateTime.isAfter(endDateTime)) {	//이후 날짜인지?
			System.out.println("종료했습니다.");
		}
}

}
