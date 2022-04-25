package ex01;
import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("몇개의 정수를 입력할지 입력하세요.");
			int intArray[] = new int[scanner.nextInt()]; //intArray에 5크기의 배열 생성
			int sum = 0;				//sum에 0의 값을 넣음
		

		System.out.print(intArray.length+"개의 정수를 입력하세요.");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
		}
		/*for(int i=0; i<intArray.length; i++) {
			sum += intArray[i];
			}
			*/
		
		
		System.out.print("평균은"+(double)sum/intArray.length);
		scanner.close();
		
		
		
	}

}
