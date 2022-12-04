package test.ch12.Method;

public class Generic_EX {

	//제네릭 메소드
	public static <T> Box <T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		//제네릭 메소드 호출 T를 Integer로 대체
		//Box 객체에 정수형을 넣은 box1이 메소드 boxing에 정수 100을 넣으면
		//boxing() 메소드에 있는 set으로 Box클래스 필드값이 100이 된다
		Box<Integer> box1 = boxing(100);
		
		//Box클래스에 있는 필드값을 출력
		int intvalue = box1.get();
		System.out.println(intvalue);
		
		Box<String> box2 = boxing("자바");
		box2.get();
		System.out.println(box2.get());
	}

}
