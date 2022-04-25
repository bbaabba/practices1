package ex01;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int array[][] = new int[4][4];
		
		for (int i=0; i<array[i].length; i++) {

			for (int j=0; j<array.length; j++) {
				int random = (int)(Math.random()*10+1);
				array[i][j]=random;
				System.out.print(random+" ");
			}
			System.out.println();
	
	}
	}

}
