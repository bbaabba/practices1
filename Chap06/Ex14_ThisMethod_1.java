package Chap06;

class A7{
	A7(){
		System.out.println("첫번째생성자");
	}
	A7(int a){
		System.out.println("두번째생성자");
	}

}

public class Ex14_ThisMethod_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A7 a1 = new A7();
		System.out.println();
		A7 a2 = new A7(3);

	}

}
