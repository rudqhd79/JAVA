package test.ch16.stream.second;

import java.io.File;
import java.io.IOException;

public class File_EX {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Temp/images");	//파일 경로 객체 생성
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");	//파일 객체 생성
		
		//디렉토리나 파일이 없으면 생성
		//exists()는 존재하면 실행되는 함수이다
		if (dir.exists() == false) { dir.mkdir(); } //디렉토리 생성
		if (file1.exists() == false) { file1.createNewFile(); } //디렉토리 생성
		if (file2.exists() == false) { file2.createNewFile(); } //디렉토리 생성
		if (file3.exists() == false) { file3.createNewFile(); } //디렉토리 생성
		
		//Temp 폴더의 파일, 폴더 리스트 출력
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();	//해당 폴더에 있는 파일 리스트 객체를 가져온다
		
		for (File file : contents) {
			//폴더(디렉토리) 인지 판단
			if (file.isDirectory()) {
				System.out.println(file.getName()); //file의 이름을 가져온다
			} else {
				//폴더가 아닌것들도 똑같이 찍는다
				System.out.println(file.getName());
			}
		}
	}

}
