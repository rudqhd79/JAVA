package test.Sol;

public class Inheritance_Sol {

	//1번 답 : 1번
	//2번 답 : 4번
	//3번 답 : 4번
	//4번 답 : 번
	//5번 답 : 4번
	//6번 :	컴파일 에러가 난 이유를 말해보시오
	//답 : Child 생성자에 에러의 이유는 super(name)으로 부모 클래스 생성자의 name을 안가져와서 그렇다
/*	public class Parent {
		public String name;
		
		public Parent(String name) {
			this.name = name;
		}
	}
	
	public class Child extends Parent {
		public int studentNo;
		
		public Child(String name, int studentNo) {
			super(name);
			this.name = name;
			this.studentNo = studentNo;
		}
	}
	*/
	//7번 : 실행 결과를 예측해보세요
	//답 : 아직 풀지 못함(오버로드로 인한 출력)
/*	public class Parent {
		public String nation;
		
		public Parent() {
			this("대한민국");
			System.out.println("Parent() call");
			//this("대한민국")은  Parent() 생성자를 가르킨다
			//this 지목명이 따로 없는 경우 자기를 포함한 메소드나 생성자를 가르키는 것이다
		}
		
		public Parent(String nation) {
			this.nation = nation;
			System.out.println("Parent(String nation) call");
			//매개변수 nation은 필드값이랑 동일
			//
		}
	}
	
	public class Child extends Parent {
		public String name;
		
		public Child() {
			this("홍길동");
			System.out.println("Child() call");
			//this("홍길동")은 Child 생성자 자기자신을 가르킨다
		}
		
		public Child(String name) {
			this.name = name;
			System.out.println("Child(String name) call");
			//매개변수는 필드값과 같다
		}
	}
	
	public class ChildExample {
		public void main(String[] args) {
			Child child = new Child();
			System.out.println(child);
		}
	}
	*/
	//8번 : 실행 결과를 예측해보세요
	//답 :
	public class Tire {
		public void run() {
			System.out.println("일반 타이어가 굴러갑니다.");
		}
	}
	
	public class SnowTire extends Tire {
		
		@Override
		public void run() {
			System.out.println("스노우 타이어가 굴러갑니다");
		}
	}
	
	public class SnowTireExample {
		public void main(String[] args) {
			SnowTire snowTire = new SnowTire();
			Tire tire = snowTire;
			
			snowTire.run();
			tire.run();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
