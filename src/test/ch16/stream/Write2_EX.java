package test.ch16.stream;

import java.io.FileOutputStream;

public class Write2_EX {

   public static void main(String[] args){
      try {
         //출력 스트림
         FileOutputStream fo = new FileOutputStream("C:/Temp/test2.db");      //파일명, 경로
         
         byte[] array = {10,20,30};

         fo.write(array);
         
         fo.flush();   //버퍼에 있는 바이트를 출력하고 버퍼를 비움(test1.db에 작성된다.)
         
         fo.close();   //출력 스트림은 반드시 닫아서 사용한 메모리를 해제.
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}