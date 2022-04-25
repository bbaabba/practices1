package ex01;
import java.util.Scanner;
public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12) : ");
		int mon = scanner.nextInt();
		
		if (mon<=2)
			System.out.print("겨울");
		else if (mon<=5)
			System.out.print("봄");
		else if (mon<=8)
			System.out.print("여름");
		else if (mon<=11)
			System.out.print("가을");
		else if (mon==12)
			System.out.print("겨울");
		else
			System.out.print("잘못 입력하셨습니다");


		/*
		 switch ()
		 case 



		 */
		
		
		scanner.close();

			
		
		
	}

}
