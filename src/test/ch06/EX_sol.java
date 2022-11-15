package test.ch06;

public class EX_sol {

	public static void main(String[] args) {

		//1번 답 : 3
		//2번 답 : 4
		//3번 답 : 4
		//4번 답 : 4
		//5번 답 : 1
		//6번 답 : 2
		//7번 답 : 3
		//8번 답 : 2
		//9번 답 : 2
		//10번 답 : 2
		//11번 답 : 1
		//12번 답 : 생성자, 메소드, 필드
		//13번 답 : 
		
		class Member  {
				String name = "김경범";
				String id= "ID";
				String password = "PW";
				int age = 25;
				String name1 = "홍길동";
				String name2 = "hong";
				
			Member(String name, String id, String password, int age) {
				this.name = name;
				this.id= id;
				this.password = password;
				this.age = age;
			}
			Member(String name, String alpha) {
				this.name1 = name1;
				this.name2 = name2;
			}
		}
		Member mem1 = new Member("김경범", "ID", "PW", 25);
		System.out.println(mem1.name);
		System.out.println(mem1.id);
		System.out.println(mem1.password);
		System.out.println(mem1.age);
		
		Member user1 = new Member("홍길동", "hong");
		System.out.println(user1.name1);
		System.out.println(user1.name2);
		
		class log {
			
		}
	
		
		
		
		
		
		
		
		
	}

}
