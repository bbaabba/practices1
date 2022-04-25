package Chap09.Sce04.Ex02;

class A {
	static int m = 3;
}
class B extends A {
	static int m = 4;
}

public class OverlapStaticField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(A.m);
		System.out.println(B.m);
		
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m); //그냥 int값도 오버라이딩이 안됐는데 static 필드에 있는 int값이 되겠음?

	}

}
