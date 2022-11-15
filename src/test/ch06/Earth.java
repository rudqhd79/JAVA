package test.ch06;

public class Earth {
	// 상수 (변수명은 대문자로 쓴다)
	// 절대 변경불가인 동시에 전역변수
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	// 변수명은 스네이크 타입으로 작성

	// static 블록 생성(static 필드를 초기화 해줄 때 사용한다)
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * Math.pow(EARTH_RADIUS, 2);
	} // Math.pow는 ERTH_RADIUS를 2번 곱한다는 뜻
}
