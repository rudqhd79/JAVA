package test.ch05;

public class Test05 {
	public static void main(String[] args) {
		/* 7번
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0; 
		for(int i : arr) {
			sum += i;
		}
		System.out.println(sum);
		*/
		
		/* 8번
		int[] array = { 1, 5, 3, 8, 2 };
		int bigInt = 0;
		
		for(int i : array) {
			if(i > bigInt) {
				bigInt = i; 
			}
			
		}
		System.out.println(bigInt);
		*/
		
		/* 9번
		int[][] array = {{95, 86},{83, 92, 96},{78, 83, 93, 87, 88}};
		int sum = 0;
		int cnt = 0;
		
		for(int i=0 ; i<array.length ; i++) {
			for(int j=0 ; j<array[i].length ; j++) {
				sum+=array[i][j];
				cnt+=1;
			}
		}
		
		System.out.println("전체 합은 : "+sum);
		System.out.println("평균은 : "+(float)sum/cnt);
		*/
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i=0 ; i<ballArr.length ; i++) {
			int j = (int) (Math.random() * ballArr.length);		//9개의 랜덤넘₩₩
			int tmp = 0;
			System.out.println(j);
		}
		
		
	}
}
