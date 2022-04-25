package Chap06;

class A{
	int m = 3;
	int n = 4;
	void work1() {
		int k=5;
		System.out.println(k);
		work2(3);
	}
	void work2(int i) {
		int j = 4;
		System.out.println((i+1));
	}
}



public class Ex01_FieldComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		System.out.println(a.m);
		System.out.println(a.n);

		a.work1();
	}

}
