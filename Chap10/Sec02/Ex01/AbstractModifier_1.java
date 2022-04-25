package Chap10.Sec02.Ex01;
//여긴 일반적인 메서드 추상화와 비교하려면 ex02로
class Animal {
	void cry() {}
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

public class AbstractModifier_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();

	}

}
