package test.ch11.Object_EX;

public class Equals_EX {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		
	}
}
