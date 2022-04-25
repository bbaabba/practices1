package ex01;
import java.util.Scanner;
public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("화씨 온도 : ");
		double a = scanner.nextDouble();
		double b = (a-32)*5/9;
		System.out.print("섭씨 온도 : " + b);
		scanner.close();


	
	}

}
