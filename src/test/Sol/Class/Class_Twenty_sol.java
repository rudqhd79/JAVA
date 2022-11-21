package Class_Sol;

public class Class_Twenty_sol {

	// static을 붙이는 이유는
	public static boolean isNumber(String str) {
		if (str.equals(null) || (str.equals(""))) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// charAt(i)는 순서대로 인덱스 번호의 배열 값 순서로 출력함
			System.out.println("값:  " + ch);

			if (ch < 0 || ch > '9') {		//'9' = 48;
				//숫자범위
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
	
	

}
