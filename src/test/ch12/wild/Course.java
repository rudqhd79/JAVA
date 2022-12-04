package test.ch12.wild;

public class Course {
   //모든 사람이 수강신청 가능
   public static void registerCourse1(Applicant<?> applicant) {
      //해당 클래스의 이름을 출력
      System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course1을 등록");
   }
   
   //학생만 수강신청 가능
   //자기 자신과 하위 클래스만 제네릭타입으로 사용 가능
   public static void registerCourse2(Applicant<? extends Student> applicant) {
      System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course2을 등록");
      
   }
   
   //직장인 및 일반인만 수강신청 가능
 //자기 자신과 하위 클래스만 제네릭타입으로 사용 가능
   public static void registerCourse3(Applicant<? super Worker> applicant) {
      System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course3을 등록");
   }

}