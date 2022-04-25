package ex01;
import java.util.Scanner;
public class WhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;

		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int n = scanner.nextInt(); //n에 값을 입력
		while(n!= -1) {		//입력된 n의 값이 -1이 아닐경우 반복
			sum += n;
		count++;
		n=scanner.nextInt(); //새로운 n을 다시 입력받음 -> 이게 없으면 n값을 더 받을 수 없어서 while루프를 빠져나가지 못함
		}
		if(count==0) System.out.println("입력된 수가 없습니다."); //while문을 벗어난 뒤 실행
		else {
			System.out.print("정수의 개수는 " + count + "개이며");
			System.out.print("평균은 " + (double)sum/count + "입니다.");
		}
		scanner.close();
		
	}
	

}
