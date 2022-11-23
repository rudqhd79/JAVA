package test.ch10;

public class Exception_EX3 {

	public static void main(String[] args) {
		String[] array = { "100", "1oo", null, "200" };

		for (int i = 0; i < array.length; i++) {
			try {
				// int형 데이터로 변환해준다
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]" + value);

				// Array 에러는 여기서 잡힌다
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				// 숫자 에러는 여기서 잡힌다
			} catch (NullPointerException | NumberFormatException e) { // 2가지 이상의 에러를 동일하게 처리 할 수 있다
				System.out.println("데이터에 문제가 있음:  " + e.getMessage());
			}
		}
	}

}
