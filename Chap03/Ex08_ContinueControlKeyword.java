package Chap03;

public class Ex08_ContinueControlKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++) {
			continue;
//			System.out.print(i+" ");
		}
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
			continue;
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					continue;
				}
				System.out.println(i+", "+j);
			}
		}
		
		System.out.println();
		POS1: for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if(j==3) {
					continue POS1; //j가 3이 되는 실행치에 for(int i=0; i<5; i++)구문으로 강제로 되돌림
				}
				System.out.println(i+", "+j);
			}
		}

	}

}
