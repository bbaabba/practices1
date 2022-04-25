package chap8;

class A{
	int a=2;
	static int b;
	static {
	b = 5;
	}
	void abc() {
		System.out.println(a);
		System.out.println(b);
	}
	static void bcd() {
		A a = new A();
		System.out.println(a);
		System.out.println(b);
	}
}

public class wtf {
	public static void main (String[] args){
		A a = new A ();
		
		System.out.println(A.b);
		
	}

}
