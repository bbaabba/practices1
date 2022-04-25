package Chap05_CreateObjectAndUsageOfMembers;


class A{
	int m=3;
	void print() {
		System.out.println("객체 생성 및 활용");
	}
}
public class CreateObjectUsageOfMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		
		System.out.println(a.m);
		a.m=5;
		System.out.println(a.m);
		
		a.print();
		

	}

}
