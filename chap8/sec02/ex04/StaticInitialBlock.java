package chap8.sec02.ex04;

class A {
	int a;
	static int b;
	static {
		b = 5;
		System.out.println("클래스 A가 로딩됐습니다.");
	} //static 블록 내의 내용을 먼저 실행함
	A(){
		a = 3;    //인스턴트 필드의 a를 3으로 초기화
	}
}

public class StaticInitialBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A.b);

	}

}
