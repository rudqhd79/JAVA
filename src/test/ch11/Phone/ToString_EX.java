package test.ch11.Phone;

public class ToString_EX {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", "Android");
		
		//toString()은 객체의 문자정보를 리턴을 한다.(@6f2b958e : 16진수 해쉬코드)
		//오버라이드 해서 사용할때는 특별하게 나타내고 싶은 문자 정보를 리턴
		//리턴을 통해 값을 재정의 할 수 있다
		String strObj = myPhone.toString();
		System.out.println(strObj);
		//toString()메소드를 실행시키지 않고도 toString()은 문자형의 출력 틀을 바꿔버린다
		System.out.println(myPhone);
		
		try {
			int value = Integer.parseInt("1oo");
		} catch(NumberFormatException e) {
			//System.err.println();은 글씨 색이 달라진다
			System.err.println("에러입니다.");
		}
	}

}
