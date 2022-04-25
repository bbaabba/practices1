package ex01;
import java.util.Scanner;
public class DivideByZeroHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
	
		while(true) {
			System.out.print("수를 입력하시오");
			int dividend = scanner.nextInt();
			System.out.print("몇으로 나눌지 입력하시오");
			int divsor = scanner.nextInt();
			
		try {
			System.out.print(dividend+"를"+divsor+"로 나누면 몫은"+ dividend/divsor+"입니다");
			break;

		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다 다시 입력하세요");
			
		}
		
		}
		scanner.close();
		
	}

}
