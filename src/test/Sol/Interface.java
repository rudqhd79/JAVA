package test.Sol;

public class Interface {
	// 1번답 : 3번
	// 2번답 : 1번
	// 3번답 : 4번
	// 4번: interface A -> Class B, C -> Class(B -> D), Class(C -> E)
	// 5번 : implement Remocon, @Overrid public void powerOn() {
	// System.out.println("TV를 켰습니다") }
	
	// 6번 :
	public interface Soundable {
		public void sound();
	}

	public class Cat implements Soundable {
		@Override
		public void sound() {
			System.out.println("야옹");
		}
	}

	public class Dog implements Soundable {
		@Override
		public void sound() {
			System.out.println("멍멍");
		}
	}

	public class SoundableExample {
		public void main(String[] args) {
			Soundable a = new Cat();
			Soundable b = new Dog();
			a.sound();
			b.sound();
		}
	}

	// 7번 :

	public interface DataAccessObject {
		public void select();
		public void insert();
		public void update();
		public void delete();
	}

	public class OracleDao implements DataAccessObject {

		@Override
		public void select() {
			System.out.println("Oracle DB에서 검색");
		}

		@Override
		public void insert() {
			System.out.println("Oracle DB를 수정");
		}

		@Override
		public void update() {
			System.out.println("Oracle DB를 수정");
		}

		@Override
		public void delete() {
			System.out.println("Oracle DB에서 삭제");
		}
	}

	public class MySqlDao implements DataAccessObject {

		@Override
		public void select() {
			System.out.println("MySql DB에서 검색");
		}

		@Override
		public void insert() {
			System.out.println("MySql DB에 삽입");
		}

		@Override
		public void update() {
			System.out.println("MySql DB를 수정");
		}

		@Override
		public void delete() {
			System.out.println("MySql DB에서 삭제");
		}
	}

	public class DaoExample {
		public void dbWork(DataAccessObject dao) {
			dao.select();
			dao.insert();
			dao.update();
			dao.delete();
		}

		public void main(String[] args) {
			dbWork(new OracleDao());
			dbWork(new MySqlDao());
		}
	}
}
