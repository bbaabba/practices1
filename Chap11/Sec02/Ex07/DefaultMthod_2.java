package Chap11.Sec02.Ex07;

interface A {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

class B implements A {
	public void abc() {
		A.super.abc();
		System.out.println("B클래스의 abc()");
	}
}

public class DefaultMthod_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		
		b.abc(); //a클래스를 먼저 호출하고 b.abc를 정했으니 이러면 A인터페이스가 먼저 호출되고 결국 둘다 출력되겠지

	}

}
