package test.ch11.Math;

import java.util.Arrays;
import java.util.Random;

public class Lotto_EX {

	public static void main(String[] args) {
		// 선택번호( 내가 선택한 번호 )
		int[] selectNumber = new int[6]; // 로또번호 6개가 저장될 배열 (빈공간 6개 생성)
		Random random = new Random(3); // seed가 3
		System.out.println("선택번호:  ");

		// 랜덤 숫자 6개를 생성해서 배열에 넣어줌
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1; // 1~45 범위의 숫자로 만든다
			System.out.println(selectNumber[i] + " ");
		}
		System.out.println();

		// 당첨번호( 컴퓨터가 주는 번호 )
		int[] winNumber = new int[6]; // 로또번호 6개가 저장될 배열 (빈공간 6개 생성)
		Random random2 = new Random(5); // seed가 5
		System.out.println("당첨번호:  ");

		// 랜덤 숫자 6개를 생성해서 배열에 넣어줌
		for (int i = 0; i < 6; i++) {
			winNumber[i] = random2.nextInt(45) + 1; // 1~45 범위의 숫자로 만든다
			System.out.println(winNumber[i] + " ");
		}
		System.out.println();

		// 당첨여부
		Arrays.sort(selectNumber);// sort는 배열값 정렬 (비교하기 전 배열 값 정렬) (배열 내부의 값들이 크기순으로 정렬됨)
		Arrays.sort(winNumber);// sort는 배열값 정렬 (비교하기 전 배열 값 정렬) (배열 내부의 값들이 크기순으로 정렬됨)

		boolean result = Arrays.equals(selectNumber, winNumber); // 두 개의 배열 값들이 같은지 비교한다(맞으면 true, 틀리면 false)
		System.out.println("당첨여부:  ");

		while (true) {
			if (result) {
				System.out.println("당첨!!");
			} else {
				System.out.println("실패");
			}
		}
	}

}
