package ex01;
import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("분자를 입력하시오 : ");
		int a = scanner.nextInt();
		System.out.print("분모를 입력하시오 : ");
		int b = scanner.nextInt();
		int c = a%b;
		int d = a/b;
		System.out.println("나눗셈의 몫 = " + d);
		System.out.println("나눗셈의 나머지 =" + c);
		
		scanner.close();
		
		

	}

}
