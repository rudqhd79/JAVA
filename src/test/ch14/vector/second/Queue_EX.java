package test.ch14.vector.second;

import java.util.*;

public class Queue_EX {

	public static void main(String[] args) {
		// Queue는 사전의미로 "줄을 서다"라는 의미이다
		Queue<Message> msgQ = new LinkedList();

		// 메세지 넣기
		// Queue에서는 offer가 목록에 추가하는 것이다(줄 서서 기다리는 것처럼 목록 뒤에 추가됨)
		msgQ.offer(new Message("sendMain", "홍길동"));
		msgQ.offer(new Message("sendSMS", "김경범"));
		msgQ.offer(new Message("sendKakao", "김자바"));

		// 메세지 보내기
		while (!msgQ.isEmpty()) { // 비어있지 않을 때 발동
			// 줄 서서
			Message msg = msgQ.poll();
			System.out.println(msg.command + ", " + msg.to);
		}
	}

}
