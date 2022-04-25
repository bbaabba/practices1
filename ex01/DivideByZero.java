package ex01;
import java.util.Scanner;
public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divsor;
		
		System.out.print("수를 입력하시오");
		dividend = scanner.nextInt();
		System.out.print("몇으로 나눌지 입력하시오");
		divsor = scanner.nextInt();
		System.out.print(dividend+"를"+divsor+"로 나누면 몫은"+ dividend/divsor+"입니다");
		scanner.close();
		
		
	}

}
