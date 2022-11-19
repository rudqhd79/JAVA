package test.ch07.poly4;

public class InstanceOf_EX {

	//메소드
	public static void personInfo(Person person) {
		// static은 객체없이 바로 불러서 사용 할 수 있음(전역변수화)
		
		//Person 클래스에서 String name을 불러온다
		System.out.println("name:  " + person.name);
		
		//Person 클래스에서 walk()메소드를 실행시킨다
		person.walk();
		//출력 결과는 "걷습니다"

		//person이 Student 객체를 품고 있는지?
		if (person instanceof Student) {
			//person인 부모객체가 Student 자식객체에 터치가 가능하다
			//오버라이드 안된 것들도 사용가능
			
			//강제타입변환
			Student student = (Student)person;
			student.study();
			System.out.println(student.studentNo);
		}
	}

	public static void main(String[] args) {
		// Person은 위 personInfo의 Person이랑 같다.
		// p1 = person이고 새로운 name값은 "홍길동"이라고 준것이다
		Person p1 = new Person("홍길동");
		personInfo(p1);

		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}

}
