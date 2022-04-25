package ex01;
import java.util.Scanner;
public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = scanner.nextInt();
		int x = num%2;
		
		String result = (x==0)?"짝수":"홀수" ;
		System.out.print(result+"입니다.");

		scanner.close();
		
	}

}
