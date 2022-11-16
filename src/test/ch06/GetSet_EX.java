package test.ch06;

public class GetSet_EX {

	public static void main(String[] args) {
		GetSet getset = new GetSet();

//		getset.setSpeed(10);
//		System.out.println(getset.getSpeed());
		// private이어도 다른 클래스에서 값을 넘겨 올 수 있다
		// retrun값을 출력한다

//		getset.getsetSpeed(10);
		System.out.println(getset.getsetSpeed(100));
		// 달릴때
		if (!getset.setStop(true)) {
			getset.setStop(true);
		}
		System.out.println(getset.getSpeed());
	}

}
