package ex01;
import java.util.Scanner;
public class InputSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 10개를 입력하세요");
		int [] inputA= new int [10];
		int tempnum;
		for (int i=0; i<10; i++) {
			inputA[i]=scanner.nextInt();
		}
		System.out.print("10개의 정수 중 찾고싶은 정수를 입력하세요");
		int num = scanner.nextInt();
		for (int i=0; i<10; i++) {
			if(inputA[i]==num) {
				tempnum = i+1;
				System.out.println(tempnum+"번째 숫자입니다");
			}
		}
		for (int i=0; i<10; i++) {
			int uppernum;
			int lowernum;
			for(int j=0;j<10; j++) {
				if(inputA[i]<inputA[j]) {
					uppernum = inputA[j];
					lowernum = inputA[i];
					inputA[i]=uppernum;
					inputA[j]=lowernum;
				
			}
				
		}


	}
		for (int i=0; i<10; i++) {
			System.out.print(inputA[i]+" ");
		}
		System.out.print('\n');

		scanner.close();

}
}