package ex01;
import java.util.Scanner;
public class Practice1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하시오 : ");
		String name = scanner.next();
		
		System.out.println(name + "씨, 안녕하세요?");
		System.out.println("JAVA에 오신 것을 환영합니다.");
		System.out.print("첫 번째 정수를 입력하시오 : ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하시오 : ");
		int num2 = scanner.nextInt();
		scanner.close();
		
		int sum = num1 + num2;
		System.out.printf("%d과 %d의 합은 %d입니다.",num1,num2,sum);
					

	}

}
