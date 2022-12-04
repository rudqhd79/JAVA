package test.ch12.extand;

public class Generic_EX {

	public static <T extends Number> boolean compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		//리턴 타입은 boolean이기 때문에 같다고 표시
		return (v1 == v2);
	}
	
	public static void main(String[] args) {
		boolean result1 = compare(10, 20);
		System.out.println(result1);

		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		
		int[] arr = { 1, 2, 3 };
		System.out.println();
	}

}
