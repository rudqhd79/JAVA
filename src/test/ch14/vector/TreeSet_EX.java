package test.ch14.vector;

import java.util.*;

public class TreeSet_EX {

	public static void main(String[] args) {

		// 배열 단위로 출력시 Integer 타입의 TreeSet은 자동정렬이 된다(오름차순)
		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(7);
		scores.add(4);
		scores.add(1);
		scores.add(5);
		scores.add(9);

		for (Integer s : scores) {
			System.out.print(s + "  ");
		}
		System.out.println(); // 자동정렬 되어서 나온다 (오름차순)

		System.out.println("가장 낮은 값:  " + scores.first());// first()는 배열 중 가장 낮은 값 불러온다
		System.out.println("가장 높은 값:  " + scores.last());// last()는 배열 중 가장 낮은 값 불러온다
		System.out.println("5보다 작은 값:  " + scores.lower(5));// lower(5)는 5보다 낮은 값
		System.out.println("5보다 큰 값:  " + scores.higher(5));// higher(5)는 5보다 높은 값

		// 내림차순
		NavigableSet<Integer> descend = scores.descendingSet(); // descendingSet()은 scores에 내림차순으로 배열을 바꿔준다

		for (Integer s : descend) {
			System.out.print(s + "  ");
		}

		// 범위 검색 ( 5 <= score)
		NavigableSet<Integer> rangeSet = scores.tailSet(5, false);
		for (Integer s : rangeSet) {
			System.out.print(s + "  ");
		}

		System.out.println();

		// 범위 검색 (4 <= score < 9)
		rangeSet = scores.subSet(4, true, 9, false); // 4, true는 4이상 / 9, false는 9미만
		for (Integer s : rangeSet) {
			System.out.print(s + "  ");
		}

	}
}
