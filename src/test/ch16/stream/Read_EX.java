package test.ch16.stream;

import java.io.FileInputStream;

public class Read_EX {

   public static void main(String[] args) {
      try {
         FileInputStream is = new FileInputStream("C:/Temp/test1.db");
         
         byte[] data = new byte[100];
         
         while (true) {
            int num = is.read();   //배열로 최대 100바이트 읽는다
            
            //if문 생략 가능
            if(num == -1) break;	//num은 찍을 것이 없으면 -1을 출력한다
            
            for (int i = 0; i<num; i++) {
            	System.out.println(data[i]);
            }
            
            System.out.println(data);
            
         }
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

}