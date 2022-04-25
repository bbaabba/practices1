package ex01;

public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10;i++) {
			for(int j=2; j<10; j++) {
				if (i==0) {
					System.out.print(j+"단");

				}
				else

				System.out.print(j+"*"+i+"="+i*j);
				System.out.print('\t');//하나씩 탭으로 띄우기
			}
		System.out.println( );

	}
	}
}