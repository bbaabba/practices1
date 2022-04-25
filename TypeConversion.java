package ex01;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		int i = 100;
		
		System.out.println(b+i);
		System.out.println(10/4); //정수대 정수의 계산의 결과값은 정수가 나온다
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);//강제 타입 변환 결과 0x41이 되며, 문자 A의 코드임 char형은 2byte이기 때문에 16진수의 41번 유니코드를 읽어온것
		System.out.println((byte)(b+i)); //227이 11100011 인데 바이트로 형변환 하면서 앞의 1을 음수가 되고 보수치환 -0011101이 됨
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9+(int)1.8);
		System.out.println();

	}

}
