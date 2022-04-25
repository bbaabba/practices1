package ex01;
import java.util.Scanner;
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unit = {50000,10000,1000,500,100,50,10,1};
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = scanner.nextInt();

		for (int i = 0; i<unit.length;i++) {
			if (i>=1) {
			int k=(money%unit[i-1])/unit[i];
			System.out.println(unit[i]+"원 짜리"+k+"개");
			}
			else {
				int k=money/unit[i];
				System.out.println(unit[i]+"원 짜리"+k+"개");
				
			}
		}
		scanner.close();
		}
	}


