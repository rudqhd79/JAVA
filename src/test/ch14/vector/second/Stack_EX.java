package test.ch14.vector.second;

import java.util.*;

public class Stack_EX {

	public static void main(String[] args) {

		// Stack은 배열이 아닌 요소를 추가하는 공간이다
		Stack<Coin> coinBox = new Stack<>();

		// push는 Stack에 추가하는 것이다 (차례대로 뒤에서 추가된다)
		// push와 반대로 제거하는 것은 pop이 있다
		coinBox.push(new Coin(100)); // push는 Stack에 넣는 것
		coinBox.push(new Coin(50)); // push
		coinBox.push(new Coin(500)); // push
		coinBox.push(new Coin(10)); // push

		// coinBox가 비었는지?
		while (!coinBox.isEmpty()) { // while문은 coinBox가 비어있지 않으면 발동이 된다
			Coin coin = coinBox.pop(); // Stack 요소 목록에서 제거
			System.out.println("꺼내온 동전:  " + coin.getValue());
		}
	}
}
