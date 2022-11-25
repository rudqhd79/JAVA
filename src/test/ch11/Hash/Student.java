package test.ch11.Hash;

public class Student {
	// 필드
	private int no;
	private String name;

	// 생성자
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	// 메소드
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		System.out.println("no:" + no + "name:" + name.hashCode());
		int hashCode = no + name.hashCode(); // no하고 name이 같으면 동일한 hashCode가 생성된다
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		// obj가 Student를 갖고 있는지?
		if (obj instanceof Student) {
			Student target = (Student) obj; // 강제타입 변환 : 슈퍼클래스 obj가 서브클래스 Student값을 가져 갈 수 있다

			// 강제형변환 당한 target이 Student의 값을 가져가려면 오버라이드 된 것들의 값을 가져가야 하므로 get을 쓴다
			// no는 숫자형이므로 == && name은 문자형이므로 equals를 쓴다
			if (no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
}
