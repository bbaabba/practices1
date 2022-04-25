package Chap03;

public class Ex05_DoWhileControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		a=0;
		while (a<0) {
			System.out.print(a+" ");
			a++;
		}
		//조건을 만족하지 않아 0회실행
		System.out.println();
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		} while(a<0);
		System.out.println();
		//조건은 한개도 성립하지 않았지만 do구문은 일단 한번 실행한다(이부분은 if와 비슷하다)
		a=0;
		while(a<1) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		//1회 실행
		a=0;
		while(a<10) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		//10회실행
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		} while(a<10);
		//while문과 실행은 같은데 do구문을 무조건 한번은 실행하고 while과 똑같이 처리하기 때문에 11회 실행이 아닌 10회 시행이다
	}

}
