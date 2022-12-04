package test.ch12;

public class Product<K, M> { // 타입 파라메터 정의

	// 필드
	private K kind; // K라는 의문의 타입 kind
	private M model; // M이라는 의문의 타입 model
	
	// 생성자

	// 메소드
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

}
