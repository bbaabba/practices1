package Chap06;

class A6{
	int m;
	int n;
	
	void init(int m, int n) {
		m = m; //자동으로 this가 붙음
		n = n;
	}
}
class B6{
	int m;
	int n;
	
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}

public class Ex13_ThisKeyword_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A6 a6 = new A6();
		a6.init(2, 3);
		System.out.println(a6.m);
		System.out.println(a6.n);
		
		
		B6 b6 = new B6();
		b6.init(2,3);
		System.out.println(b6.m);
		System.out.println(b6.n);

	}

}
