package ex01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum = 0, n=0;
		for (int i=0; i<3; i++) {
			System.out.print((i+1)+">>");
			try {
				n=scanner.nextInt(); //n에 입력값을 받음, 
				
			}
			catch(InputMismatchException e) { //inputmismatchexception 발생할 경우 이 구문으로 넘어옴
				System.out.println("정수가 아닙니다. 다시 입력하세요");
				scanner.next();
				i--; //i값이 증가하지 않도록 1을 다시 뺌
				continue; //for구문을 끝내지 않고 다시 하게 만듦
				
			}
			sum += n; //여기까지가 for문, try구문에서 얻은 n값을 sum에 합함
		}
			System.out.println("합은 "+sum);
			scanner.close();
	}

}
