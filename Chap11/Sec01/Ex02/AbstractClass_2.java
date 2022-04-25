package Chap11.Sec01.Ex02;

abstract class A {
	abstract void abc();
}

public class AbstractClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new A() {
			void abc() {
				System.out.println("방법 2. 익면 이너 클래스 방법으로 객체 생성");
			}
		};//여기까지가 a1객체 생성

		A a2 = new A() {
			void abc() {
				System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};

		a1.abc();
		a2.abc();
	}

}
