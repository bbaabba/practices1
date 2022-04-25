package Chap06;

class A3{
	int m;
	void work() {
		System.out.println(m);
	}
	
}
class B{
	int m;
	void work() {
		System.out.println(m);
	}
	B(){
		
	}	
}
class C{
	int m;
	void work() {
		System.out.println(m);
	}
	C(int a){
		m=a;
	}
}



public class Ex10_DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a3 = new A3();
		B b = new B();
		//C c = new C(); << 생성자를 안정한 클래스가 없어서 사용불가능
		C c = new C(3);

		a3.work();
		b.work();
		c.work();
	}

}
