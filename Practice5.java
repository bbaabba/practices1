package ex01;
import java.util.Scanner;
public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원) : ");
		double won = scanner.nextDouble();
		double dol = won/1200;
		
		System.out.println(won + "원은 $" +dol+ "입니다.");
		
		scanner.close();

	}

}
