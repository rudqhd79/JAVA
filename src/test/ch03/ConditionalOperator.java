package test.ch03;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3항 연산자
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은" + grade + "등급입니다");
	}

}
