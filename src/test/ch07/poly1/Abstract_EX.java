package test.ch07.poly1;

public class Abstract_EX {

	//메소드(매개변수로 선언(가져오기))
	public static void animalSound(Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {
		
		//추상클래스 (abstract class)는 서브클래스 객체가 오버라이딩 되었을 때만 인스턴트를 생성 할 수 있다
		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();

		// 매개변수의 다형성
		animalSound(dog);
		animalSound(cat);
	}
}
