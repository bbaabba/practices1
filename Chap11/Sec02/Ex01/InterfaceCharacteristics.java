package Chap11.Sec02.Ex01;

interface A {
	public static final int a = 3;
	public abstract void abc();
}

interface B {
	int b = 3; //추상화 된 클래스에 값을 만들어놓은건 이 클래스를 벗어나면 힘을 못씀
	void bcd();//그러므로 컴파일러가 자동으로 앞에 public static final이나 public abstract void 를 부여함
}

public class InterfaceCharacteristics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static 자동 추가 확인
		System.out.println(A.a);
		System.out.println(B.b);
		//final 자동 추가 확인
		// A.a = 5;
		// B.b = 5;
	}

}
