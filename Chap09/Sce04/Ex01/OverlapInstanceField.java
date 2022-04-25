package Chap09.Sce04.Ex01;

class A {
	int m = 3;
}
class B extends A {
//	@Override 이미 선언된 객체를 오버라이딩 하는것은 불가능함 (메서드만 가능)
	int m = 4;
}

public class OverlapInstanceField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);

	}

}
