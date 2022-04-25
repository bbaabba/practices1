package Chap10.Sec02.Ex02;

abstract class Animal {
	abstract void cry(); //추상 클래스
}

class Cat extends Animal {
	void cry() {
		System.out.println("ㅇㅇ");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("ㅁㅁ");
	}
}

public class AbstractModifier_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();

	}

}
