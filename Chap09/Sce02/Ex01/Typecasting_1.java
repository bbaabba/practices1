package Chap09.Sce02.Ex01;

class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Typecasting_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A ac = (A) new C();
		B bc = (B) new C();
		
		B bb = new B();
		
		A a = (A) bb;
		
		A aa = new A();
		
		A ab = new B();
		
		B bd = new D();
		
		D d = (D) bd;
		
		A ad = new D();
		
		B b1 = (B) ad;
		D d1 = (D) ad;
		
	}

}
