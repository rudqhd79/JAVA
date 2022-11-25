package test.ch11.String;

public class StringBuilder_EX {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")	//append는 문자열 끝에 추가
				.insert(0, "abc") 	// insert는 중간에 추가 ()안에는 위치를 정할 수 있다.
				.delete(3, 4)			//문자열 일부를 삭제 (시작 위치, 끝 위치)
				.toString();			//완성된 문자열을 String 타입으로 리턴
		System.out.println(data);
	}

}
