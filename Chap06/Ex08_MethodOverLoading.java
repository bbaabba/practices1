package Chap06;

public class Ex08_MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print();
		print(3);
		print(5.8);
		print(2,5);
	}
	
	public static void print() {
		System.out.println("데이터가 없습니다");
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(double a) {
		System.out.println(a);
	}
/*	public static void print(double b) {
		System.out.println(b);
	} a던 b던 리턴타입은 시그니쳐에 상관이 없음 =a와 동일 메서드 취급
*/
	public static void print(int a, int b) {
		System.out.println("a: " + a +"b: "+b);
	}
/*	public static int print(int a, int b) {
		System.out.println("a: " + a +"b: "+b);
		return a+b;
	} 얘도 안됨
*/	
	
}
