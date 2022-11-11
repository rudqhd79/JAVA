package test.ch02;

public class test {
	
	public static void main (String[] args) {
//		byte byteValue = 10;
//		int intValue = byteValue;
//		System.out.println(intValue);
		
//		char charValue = '가';
//		intValue =charValue;
//		System.out.println(intValue);
//		
//		intValue = 50;
//		long longValue =intValue;
//		System.out.println(longValue);
//		
//		longValue = 100;
//		float floatValue = longValue;
//		System.out.println(floatValue);
//		
//		floatValue = 100.5f;
//		double doubleValue = floatValue;
//		System.out.println(doubleValue);
//		
		//char 타입의 허용범위는 음수가 없지만 byte는 음수가 있기때문에 실행되지 않는다.
//		byte test = 65;
//		char charValue = test;
		
//		short a = 1000;
//		char b = (char) a;
//		System.out.println(b);
		
		int intValue = 123154;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);
		
		long var1 = 300;
		int var4 = (int) var1;
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6);
		
		double var7 = 3.14;
		int var8 = (int)var7;
		System.out.println(var8);
		
//		byte x = 10;
//		byte y = 20;
//		byte result = (byte) (x + y);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000l;
		long result = v3 + v4 + v5;	//타입이 제일 큰 long으로 해줘야 값이 출력된다
		
		char v6 = 'A';
		char v7 =  1;
		char result4 = (char) ((char) v6 + v7);
		
		int v8 = 10;
		double result5 =  v8 / 4;
		
		int v9 = 10;
		double result6 = v9 / 4;	//정수자리만 적으면 정수로 적용됨
		double result7 = v9 / 4.0;	//실수자리인 소수점을 적으면 double로 인식함
		
		double v10 = 1;
		int v11 = 2;
		double result8 = v10 / v11;
		double result9 = (double) v10 / v11;
		
		System.out.println(result8);
		
		String str = "안녕하세요";
		int val = 1;
		String val12 = "3";
		System.out.println(str + val + val12);
		//정수 + 문자열 = 문자열
		
		System.out.println(2 + val + val12);
		System.out.println(val12 + val + 50);
		//2 + val 은 3이 되고 뒤에 val12 는 문자열로 찍힌다
		
		byte value = Byte.parseByte(val12);
		//문자형을 byte형으로 변환할 수 있다
		int value2 = Integer.parseInt(val12);
		//문자형을 int형으로 변환할 수 있다
		double value3 = Double. parseDouble(val12);
		//문자형을 double형으로 변환할 수 있다
		
//		String str2 = String.valueOf(val);
//		//기본형(primitive형)으로 변환 -> String형으로 변환
//		String str2 = String.valueOf(3.14);
//		String str2 = String.valueOf(true);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
