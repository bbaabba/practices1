package ex01;
import java.util.Scanner;
public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 중심과 반지름을 입력하시오.");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		double rad = scanner.nextDouble();

		System.out.print("두 점을 입력하시오.");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		if	((a-x)*(a-x)+(b-y)*(b-y)<rad*rad)
			System.out.println("점("+a+","+b+")는 원 안에 있습니다");
		else
			System.out.println("점("+a+","+b+")는 원 안에 있지 않습니다");

		scanner.close();
		
		
		
	}

}
