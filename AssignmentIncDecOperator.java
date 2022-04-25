package ex01;

public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3, b=3, c=3;
		a+=3; //a=a+3 = 6
		b*=3; //b=b*3 = 9
		c%=2; //c=c%2 = 1
		System.out.println("a="+a+",b="+b+",c="+c);

		int d=3;
		
		a= d++;		//a와 d를 동기화 한 후 d에 1의 값 추가 a=3, d=4
		System.out.println("a="+a+",d="+d);
		a=++d;		//d에 1의 값을 추가한 후 a와 동기화 d=5, a=5
		System.out.println("a="+a+",d="+d);
		a=d--; 		//a와 d를 동기화 한 뒤 d에 1을 뺌 a=5, d=4
		System.out.println("a="+a+",d="+d);
		a= --d;		//d에 1을 뺀 뒤 a를 d와 동기화 a=3, d=3
		System.out.println("a="+a+",d="+d);



	}

}
