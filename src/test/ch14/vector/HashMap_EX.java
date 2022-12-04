package test.ch14.vector;

import java.util.HashMap;

//HashMap은 배열에 포함된 글자를 찾아서 값을 출력 할 수 있는 것이다
public class HashMap_EX {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		
		//HashMap은 리스트에 add대신 put을 사용한다
		map.put("김경범", 85);		
		map.put("유정현", 95);
		map.put("박민우", 90);
		map.put("김솔", 90);
		
		System.out.println("총 Entry 수:  " + map.size());
		
		//키로 값 얻기
		String key = "김경범";
		int value = map.get(key);
		System.out.println("점수:  " + value);
	}

}
