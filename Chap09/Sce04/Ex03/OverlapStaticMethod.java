package Chap09.Sce04.Ex03;

class A {
	static void print() {
		System.out.println("A클래스");
	}
}
class B extends A {
	static void print() {
		System.out.println("B클래스");
	}
}

public class OverlapStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A.print();
		B.print();
		
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		aa.print();
		bb.print();
		ab.print();
		

	}

}
