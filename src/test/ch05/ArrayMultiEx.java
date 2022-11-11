package test.ch05;

public class ArrayMultiEx {

	public static void main(String[] args) {
		int scores[][] = {{80,90,96},{76,88}};
		int mathScore [][] = new int[2][3];
		
		for(int i=0 ; i<mathScore.length ; i++) {
			for(int k=0 ; k<mathScore[i].length ; k++) {
				mathScore[i][k] = 80;
				System.out.println("수학점수 : "+mathScore[i][k]);
			}
		}
				
				
		int totalStudent = 0;
		int totalSum = 0;

		for(int i=0 ; i<scores.length ; i++) {
			totalStudent += scores[i].length;
			
			for(int k=0 ; k<scores[i].length ; k++) {
				totalSum += scores[i][k];
			}
		}
 		double totalAvg = (double)totalSum / totalStudent;
 		System.out.println("전체 학생 평균: " + totalAvg);
	}

}
