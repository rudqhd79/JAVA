package test.ch12;

public class Generic_EX {

	public static void main(String[] args) {
		// Box객체의 타입이 String이라는 것이다
		Box<String> box1 = new Box<String>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);

		Box<Integer> box2 = new Box<Integer>();
		box2.content = 100;
		int val = box2.content;
		System.out.println(val);
	}
	
}
