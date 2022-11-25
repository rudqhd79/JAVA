package test.Sol;

public class javaBase {

	public static void main(String[] args) {
		//1번 답 : 3번
		//3번 답 : 2번
		//6번 답 :
/*		public class Member {
			private String id;
			private String name;
			
			public Member(String id, String name) {
				this.id = id;
				this.name = name;
			}
			
			@Override
			public String toString(String id, String name) {
				return id + ":" + name;
			}
		}
		
		public class MemberExample {
			public static void main(String[] args) {
				Member member = new Member("blue", "이파란");
				System.out.println(member);
			}
		}
		*/
		
		//9번 답 :
		
		public class DecodingExample {
			public static void main (String [] args) throws Exception {
				byte[] bytes = { -20, -107, -120, -21, -123, -107 };
				String str = new String(byte[] bytes);//UTF-8 생략가능
				System.out.println("str:  " + str);
			}
		}
		
		//10번 답 :
		
		public class StringBuilderExample {
			public static void main(String[] args) {
				String str = "";
				for (int i =1; i <=100; i++) {
					str += i;
				}
				System.out.println(str);
			}
		}
		
		//11번 답 :
		String data1 = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(data1, " ");
		
		//12번 답 :	-127~128까지는 값 비교, 범위 넘어가면 주소를 비교
		public class IntegerCompareExample {
			public static void main(String [] args) {
				Integer obj1 = 100;
				Integer obj2 = 100;
				Integer obj3 = 300;
				Integer obj4 = 300;
				
				System.out.println(obj1 == obj2);
				System.out.println(obj3 == obj4);
			}
		}
		
		//13번 답 : 4번 (Math.round(5.7)을 반올림하면 6.0이 아닌 6이 나온다)
		
	}

}
