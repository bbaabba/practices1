package Chap06;

class A5{
	int m;
	int n;
	
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;
		this.n = b;
	}
	void work() {
		this.init(2, 3);
	}
}

public class Ex12_ThisKeyword_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A5 a5 = new A5();
		a5.work();
		System.out.println(a5.m);
		System.out.println(a5.n);

	}

}
