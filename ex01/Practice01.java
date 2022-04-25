package ex01;
import java.util.Scanner;
public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요");
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		int k = i*j;
		if (i<j) {							//i가 작은값일 때
			int div = j%i;
			while (div!=0) {
				j=i;
				i=div;
				div = j%i;
			}
			System.out.println("최대공약수는"+i+"입니다.");//최대공약수는 i입니다
			System.out.println("최소공배수는"+k/i+"입니다.");//최소공배수는 k/i입니다
			
		}
			else {				//j가 작은값일 때
				int div = i%j;
				while (div!=0) {
					i=j;
					j=div;
					div = i%j;
				}
				System.out.println("최대공약수는"+j+"입니다.");//최대공약수는 j입니다
				System.out.println("최소공배수는"+k/j+"입니다.");//최소공배수는 k/j입니다				

			}
	scanner.close();
	}

}

	
	