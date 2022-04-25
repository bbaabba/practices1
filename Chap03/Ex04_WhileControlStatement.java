package Chap03;

public class Ex04_WhileControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		while (a<10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int b=10;
		while(b>0) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println();
		
		for(int i=10; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int c = 0;
		while(true) {
			if(c>10) {
				break;
			}
			System.out.print(c+ " ");
			c++;
		}
		
	}

}
