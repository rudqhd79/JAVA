package test.ch11.Wrapper;

public class ValueCompare_EX {

	public static void main(String[] args) {
		Integer obj1 = 300;	//interger는 int형 정수가 아닌 객체 자체이다
		//객체는 참조타입(주소를 가지고 있음)
		Integer obj2 = 300;
		System.out.println(obj1 == obj2);	//주소가 다르니 false
		System.out.println(obj1.equals(obj2));	//값을 비교하니 true
		System.out.println();
		
		/*
			[값을 비교하는 타입]
	 	 Boolean
		 Character
		 byte, short, int : -128 ~ 127
		  */
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
	}

}
