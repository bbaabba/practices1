package Chap06;

class A1{
	boolean m1;
	int m2;
	double m3;
	String m4;
	//위는 필드에 놓은 변수라 자동 초기화됨
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalVariable() {
		int k;
		//System.out.println(k); << 지역변수를 초기화 하지 않아 오류 발생
	}

}


public class Ex02_InitialValueOfFieldAndLocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		a.printFieldValue();


	}

}
