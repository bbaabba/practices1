package Chap09.Sce05.Ex02;

class A {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}
class B extends A {
	void abc () {
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {
		super.abc(); //여기서 다시 부모의 abc를 호출함
	}
}

public class SuperKeyword_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B bb = new B();

		bb.bcd();
	}

}
