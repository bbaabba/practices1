package ex01;

public class PracticeSelSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {41, 31, 48, 97, 9, 65, 27, 29, 13, 15};
		String b [] = {"A+", "A+","A","B+","B","C+","C","D+","D","F"};
		
		for (int i=0; i<a.length; i++) {
		System.out.print(a[i]+"\t");
		}
		System.out.print('\n');
		for(int i=0; i<a.length; i++) {
			int counter = 0;
			
			for(int j=0; j<a.length; j++) {
				if(a[i]<a[j]) {
					counter++;
				}
				
			}
			System.out.print(b[counter]+'\t');
		}
		
		for (int i=0; i<a.length; i++) {
			int uppernum;
			int lowernum;
			for(int j=0; j<a.length; j++) {
				if(a[i]>a[j]) {
					uppernum = a[j];
					lowernum = a[i];
					a[i]=uppernum;
					a[j]=lowernum;
				}
			}
			
		}
		System.out.print('\n');
		for (int i=0; i<a.length; i++) {
		System.out.print(a[i]+"\t");
	}
		System.out.print('\n');
		for (int i=0; i<a.length; i++) {
		System.out.print(b[i]+"\t");
	}

}

}