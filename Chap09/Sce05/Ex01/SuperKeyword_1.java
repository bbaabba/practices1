package Chap09.Sce05.Ex01;

class A {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}
class B extends A {
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {
		abc();
	}
}


public class SuperKeyword_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B bb = new B();
		bb.bcd(); //오버라이딩이 됐으니 당연히 B클이 뜨겠지?

	}

}
