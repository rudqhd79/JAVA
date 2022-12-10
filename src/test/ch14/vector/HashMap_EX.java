package test.ch14.vector;

import java.util.*;
import java.util.Map.Entry;

//HashMap은 배열에 포함된 글자를 찾아서 값을 출력 할 수 있는 것이다
public class HashMap_EX {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		// HashMap은 리스트에 add대신 put을 사용한다
		map.put("김경범", 85);
		map.put("유정현", 95);
		map.put("박민우", 90);
		map.put("김자바", 90);

		System.out.println("총 Entry 수:  " + map.size());

		// 키로 값 얻기
		String key = "김경범";
		int value = map.get(key);
		System.out.println("점수:  " + value);

		// 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator(); // 반복된 키를 얻는다

		// hasNext()는 boolean형이다
		// hasNext() 다음 키가 입력된 값이 keyIterator와 관련이 있으면 true 아니면 false를 반환한다
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(keyIterator);
			System.out.println(k + ":" + v);
		}

		// 반복해서 키와 값을 얻기 두번째 방법
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator(); // 반복된 키를 얻는다

		while (entryIterator.hasNext()) { // 다음 키가 있는지 찾는다
			Entry<String, Integer> entry = entryIterator.next();
			String a = entry.getKey(); // 키를 가져옴
			Integer b = entry.getValue(); // 값을 가져옴
			System.out.println(a + ":" + b);
		}
	}

}
