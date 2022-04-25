package chap8.sec02.ex02;

class A{
	int m = 3;
	static int n = 5;
}

public class StaticField_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new A();
		
		a1.m = 5;//static값이 아니기 때문에 a1.m에 인스턴스 값을 새로 생성
		a2.m = 6;//a2.m에 인스턴스 값을 새로 생성
		
		System.out.println(a1.m); //5 출력
		System.out.println(a2.m); //A.m으로 하면 오류
		
		a2.n = 7;
		a2.n = 8;
		System.out.println(a1.n); //n은 static이므로 A.n해도 가능
		System.out.println(a2.n);
		A.n = 9;
		System.out.println(a1.n);
		System.out.println(a2.n);

	}

}
