package test.ch07;

//Airplane은 슈퍼클래스 SuperSonicAirplane은 서브클래스
public class SuperSonicAirplane extends Airplane {
	// 상수(항상 static final을 붙여줘야 한다)
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	// 필드
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속 비행");
		}
		// NORMAL 일때
		else {
			// super.메소드명() => 부모클래스의 메소드 실행
			super.fly();
		}
		
	}
}
