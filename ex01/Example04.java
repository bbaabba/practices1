package ex01;
import java.util.Scanner;
public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 몇 개?");
		int s = scanner.nextInt();
		int array [] = new int[s];
		for (int i=0; i<array.length;i++) {
		int random = (int)(Math.random()*100+1);
			array [i] = random;
			for(int j=0; j<=i;j++)
			{
				if(i!=j&&array[i]==array[j]) {					
					i--;
				}
			}
		}
			for(int i=0; i<array.length;i++) {
				System.out.print(array[i] +" \t ");
				if ((i+1)%10==0) {
					System.out.println("");
				}
			}	
		scanner.close();
	}
}
