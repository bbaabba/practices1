package ex01;
import java.util.Scanner;
public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하시오");// 두 변의 합이 나머지 한 변 길이보다 작으면 된다
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		/*
		if (a+b<=c) 
			System.out.print("삼각형이 안됩니다");	
	
		else if(b+c<=a)
			System.out.print("삼각형이 안됩니다");	
			
		else if(a+c<=b)
			System.out.print("삼각형이 안됩니다");	
				
		else
			System.out.print("삼각형이 됩니다");	
			*/
/*		if (a+b>=c||b+c>=a||a+c>=b)
		System.out.println("삼각형이 안됩니다");
		else
		System.out.println("삼각형이 됩니다");
		*/
		
		System.out.print((c<a+b&&b<a+c&&a<b+c)?"삼각형이 됩니다":"삼각형이 안됩니다");
		scanner.close();

		
		
		}
		
	}

