package ex01;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] n = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		for (int k[] : n) {
			
			for (int f : k) {
				System.out.print(f+" ");
			}
			System.out.println();

		}
		
	}

}