package Chap10.Sec01.Ex02;

class A {
	void abc() {}
	final void bcd() {}
}

class B extends A {
	void abc() {}
	//void bcd() {}  final 메서드는 오버라이딩도 안된다
}

final class C {}

//class D extends C {} final 클래스는 상속도 안된다

public class FinalModifier_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
