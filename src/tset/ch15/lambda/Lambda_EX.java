package tset.ch15.lambda;

public class Lambda_EX {

	public static void main(String[] args) {
		/*
		   action(new Calculable() { //하위 클래스 + 오버라이드
		  
		   @Override
		   public void calculate(int x, int y) {
		   System.out.println(x + y); }
		   });
		 */

		// 오버라이드 메소드 생략가능
		action((x, y) -> {
			System.out.println(x + y);
		});
		
		action((x, y) -> System.out.println(x + y)); // 생략 가능

		//매개변수가 하나일 때는 생략가능
//		action(x -> System.out.println(x));
		
		action((x, y) -> {
			System.out.println(x - y);
		});
	}

	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		calculable.calculate(x, y);
	}
}
