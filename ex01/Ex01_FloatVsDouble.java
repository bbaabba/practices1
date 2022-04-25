package ex01;

public class Ex01_FloatVsDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1 = 1.0000001f;
		System.out.println(f1);
		float f2 = 1.00000001f; // <소수 8자리를 넘어간 숫자는 취급 안함 = 맨 뒤의 1이 무시됨 = 1.0으로 표시됨
		System.out.println(f2);
		
		
		double d1 = 1.000000000000001;
		double d2 = 1.0000000000000001;
		
		System.out.println(d1);
		System.out.println(d2);

	}

}
