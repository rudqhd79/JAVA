package test.ch05;

public class StringMethod {

	public static void main(String[] args) {
		
		String board = "1, 자바 학습, 참조 타입, String 공부중";
		String[] arr = board.split(",");
		
		for(int i=0 ; i<=arr.length ; i++) {
			System.out.println(arr[i]);			
		}
 		
//		String subject = "자바 프로그래밍";
//		int location = subject.indexOf("프로그래밍");	
//		System.out.println(location);
//		
//		String substring = subject.substring(location);
//		System.out.println(substring);
//		
//		if(location == -1) {
//			System.out.println("해당 문자열이 없습니다.");
//		}
//		
//		boolean result = subject.contains("자바");
//		
//		if(result) {			
//			System.out.println("자바 관련된 책입니다.");
//		}
//		else {			
//			System.out.println("자바 관련된 책이 아닙니다.");
//		}
		
		
//		String ssn = "950624-1230123";	//주민번호
//		
//		String firstName = ssn.substring(0,6);	//0~6이전
//		System.out.println(firstName);			
//
//		
//		String secondName = ssn.substring(7);	//7부터~
//		System.out.println(secondName);			

		
		
//		char sex = ssn.charAt(6);		//문자열의 인덱스번호에 해당하는 요소를 출력
//		int length = ssn.length();
//		
//		if(length == 13 ) {
//			System.out.println("주민번호 자릿수가 맞습니다.");			
//		}
//		else {
//			System.out.println("주민번호 자릿수가 맞지 않습니다.");						
//		}
//		
//		switch(sex) {
//		case '1':
//		case '3':
//			System.out.println("남자입니다.");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자입니다.");
//			break;
//		}
		
		
//		String oldStr = "자바 문자열";
//		String newStr = oldStr.replace("자바", "Java");
//		System.out.println(oldStr);
//		System.out.println(newStr);
		
		

	}

}
