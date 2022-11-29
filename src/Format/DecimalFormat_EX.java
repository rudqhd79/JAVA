package Format;

import java.text.DecimalFormat;

public class DecimalFormat_EX {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");		//포맷을 정한다
		System.out.println(df.format(num));	//포맷을 적용
		
		df = new DecimalFormat("#,##,#");		//포맷을 정한다
		System.out.println(df.format(num));	//포맷을 적용
		
		df = new DecimalFormat("##,##");		//포맷을 정한다
		System.out.println(df.format(num));	//포맷을 적용
		
		df = new DecimalFormat("##,##.00");		//포맷을 정한다 (.0으로 정수로 바꾸지 않고 소수점 첫째자리까지 나타낸다)
		System.out.println(df.format(num));	//포맷을 적용
	}

}
