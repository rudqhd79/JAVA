package test.ch14.vector;

import java.util.Vector;
import java.util.ArrayList;
import java.util.List;

public class Vector_EX {

	public static void main(String[] args) {
//		Vector<Board> list2 = new Vector<>(); // List는 vector의 부모 인터페이스 (자동형변환)
		ArrayList<Board> list = new ArrayList<>();

		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}
		};

		Thread threadB = new Thread() {
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}
		};
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}
		
		int size = list.size();
		System.out.println("총 객체 수 :" + size);
		System.out.println();
	}

}
