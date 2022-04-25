package Chap10.Sec01.Ex01;

class A1{
	int a = 3;
	final int b = 5;
	A1() {
		
	}
}

class A2 {
	int a;
	final int b;
	A2() {
		a=3;
		b=5;
	}
}

class A3 {
	int a = 3;
	final int b = 5;
	A3() {
		a=5;
		//b=5; A1이나 A2처럼 선언이 완료된 final 필드는 더이상 값 대입이 불가능하다
	}
}

class B {
	void bcd() {
		int a = 3;
		final int b = 5;
		a = 7;
		//b=9; final 지역변수도 값 대입 불가능하다
	}
}

public class FinalModifier_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1 a1 = new A1();
		A2 a2 = new A2();
		
		a1.a = 7;
		//a1.b = 7; << final 영역 변경 불가능
		a2.a = 7;

	}

}
