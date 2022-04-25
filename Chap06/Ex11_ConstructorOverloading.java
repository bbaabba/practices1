package Chap06;

class A4{
	A4(){
		System.out.println("첫번째생성자");
	}
	A4(int a){
		System.out.println("두번째생성자");
	}
	A4(int a, int b){
		System.out.println("세번째생성자");
	}
}


public class Ex11_ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4 a = new A4();
		A4 b = new A4(3);
		A4 c = new A4(3,5);

	}

}
