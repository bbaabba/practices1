package chap8.sec02.ex01;

class A {
	int m = 3;
	static int n = 5;
}

public class StaticField_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		System.out.println(a1.m); //m은 static이 아니므로 A.m불가능
		System.out.println(A.n);  //n은 static이므로 A.n이 가능
		A a2 = new A();
		System.out.println(a2.n); //n은 static이므로 a2.n이라는 쓰레기값이 나옴
	
	}

}
