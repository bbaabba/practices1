package chap8.sec02.ex03;

class A {
	void abc() {
		System.out.println("instance 메서드");
	}
	
	static void bcd() {
		System.out.println("static 메서드");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		a1.abc();
		
		A.bcd();
		
		A a2 = new A();
		a2.bcd(); //A.bcd가 가능한데 왜 a2.bcd같은 쓰레기값을 만들어놓는지 쿠사리 먹임
		

	}

}
