package test.ch03;

public class OverflowUnderflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;
		// -128 ~ 127 (byte의 범위) -> 최대값 범위를 넘어서면 overflow라고 한다
		for (int i = 0; i < 5; i++) {
			var1++;
			System.out.println("var1:   " + var1);
			// overflow가 일어나면 값이 반대로 된다(+에서 -로 바뀌고 값이 서서히 커진다)
		}
		byte var2 = -125;
		// -128 ~ 127 (byte의 범위) -> 최소값 범위를 넘어서면 underflow라고 한다
		for (int i = 0; i < 5; i++) {
			var2--;
			System.out.println("var2:   " + var2);
			// underflow가 일어나면 값이 반대로 된다(-에서 +로 바뀌고 값이 서서히 작아진다)
		}
	}

}
