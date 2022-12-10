package tset.ch15.lambda2;

public class Lambda_EX2 {

	public static void main(String[] args) {

		/*
		Person person = new Person();
		
		person.clac(10, 4);
		*/
		
		Person person = new Person();
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});

		// 결과는 같다
		person.action((x, y) -> x + y);
		person.action((x, y) -> x * y);
	}
}
