package test.ch05;

public class EqualsEx {

   public static void main(String[] args) {
         //String은 리터럴 값이 같으면 같은 주소를 가리킨다(참조한다.)
         String strVar1 = "홍길동";
         String strVar2 = "김하서";
         
         if (strVar1 == strVar2 ) {
            System.out.println("strVal1 와 strVal2는 참조가 같음");
            
         }
         else {
            System.out.println("strVal1 와 strVal2는 참조가 다름");
         }
         
         if(strVar1.equals(strVar2)) {
            System.out.println("strVal1 와 strVal2는 문자열이 같음");
         }
         
         String strVar3 = "홍길동";
         String strVar4 = "홍길동";
         
         if(strVar3 == strVar4) {
             System.out.println("strVal3 과 strVal4는 문자열이 같음");
         }
         
         
   }
}