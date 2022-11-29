package test.Sol.Class;

public class twenty_one_EX {

	public static int max(int[] arr) {
		if (arr == null || arr.length == 0) {
			// 배열이 null 이거나 크기가 0 인 것
			return -999999;
		}
		int maximum = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (maximum < arr[i]) {
				maximum = arr[i];
			}
		}
		return maximum;
	}
	// max 메소드 작성

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
	}

}
