package test.ch14.vector;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Test {
	
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		//시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i<10000; i++) {
			list1.add("hi");
		}
		
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime-startTime) );	}
}
