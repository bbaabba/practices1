package Chap03;

public class Ex07_BreakControlKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			break;
		}
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i+" ");
		}
		System.out.println();
		System.out.println();

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					break;
				}
				System.out.println(i+", "+j);
			}
		}
	
		System.out.println();
		
		POS1: for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					break POS1;
				}
				System.out.println(i+", "+j);
			}
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					i=100;
					break;
				}
				System.out.println(i+", "+j);
			}
		}
		System.out.println();
		
	}

}
