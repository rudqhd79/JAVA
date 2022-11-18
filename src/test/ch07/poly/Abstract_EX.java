package test.ch07.poly;

public class Abstract_EX {

	public static void animalSound(Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();

		// 매개변수의 다형성
		animalSound(dog);
		animalSound(cat);
	}

}
