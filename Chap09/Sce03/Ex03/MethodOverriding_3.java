package Chap09.Sce03.Ex03;

class A {
	void print1() {
		System.out.println("A클래스 print1");
	}
	void print2() {
		System.out.println("A클래스 print2");
	}
}
class B extends A{
	@Override
	void print1() {
		System.out.println("B클래스 print1");
	}
	void print2(int a) {
		System.out.println("B클래스 print2");
	}
	
}

public class MethodOverriding_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		aa.print1();
		aa.print2();
		System.out.println();
		B bb = new B();
		bb.print1();
		bb.print2();   //A를 상속받았기 때문에 이미 A범위에 추가로 B(int)가 있을뿐임
		bb.print2(3);
		System.out.println();
		A ab = new B(); // A타입을 B생성자를 통해 선언(B는 A를 가지고있지? 그걸 통해 A만을 선언함)
		ab.print1();
		ab.print2();
//		ab.print2(3);  overriding 되지 않아 오류가 뜬다

	}

}
