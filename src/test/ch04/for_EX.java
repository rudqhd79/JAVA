package test.ch04;

public class for_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("sum:  " + sum);

//		for (int i = 1, j = 1; i <= 10; i++, j++) {
//			System.out.println(i);
//			System.out.println(j);
//		}

		for (int m = 1; m <= 9; m++) {
			System.out.println("***" + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + "x" + n + "=" + (m * n));

			}
		}
	}

}
