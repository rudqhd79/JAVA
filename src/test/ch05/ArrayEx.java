package test.ch05;

public class ArrayEx {

	public static void main(String[] args) {
		//int,short, byte:0 / long: 0L / char: '\u0000' / float: 0.0f / double: 0.0 / boolean: false / String: null
		int[] arr1 = new int[3]; //0 3개 들어있는 배열 생성
		
		double arr2[] = new double[5];
		
		for(int i=0 ; i<=arr1.length ; i++) {
			arr1[i] = 10;
			System.out.println(arr1[i]);
		}
		
		for(int i=0 ; i<=arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		/*
		String season [] = {"Spring","Summer","Fall","Winter"};	//배열 선언
		//String [] season = {"Spring","Summer","Fall","Winter"};	//배열 선언
		String season2 []; //빈 배열
		season[1] = "여름";
		
		for(int i=0; i<season.length ; i++) {
			System.out.println(season[i]);
		}
		System.out.println();
		
		int scores[] = {83, 90, 87};
		//총합, 평균
		int sum =0;
		
		for(int i=0; i<scores.length ; i++) {
			sum+= scores[i];
		}
		double avg = (double)sum / scores.length;
		
		System.out.println("총합은 "+sum);
		System.out.println("평균은 "+avg);
		*/
	}

}
