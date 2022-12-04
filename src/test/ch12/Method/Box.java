package test.ch12.Method;

//T라는 의문의 타입 클래스 Box
public class Box<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
