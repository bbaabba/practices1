package ex01;
import java.util.Scanner;
public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("알파벳을 입력하시오>>");
		String s  = scanner.next(); 
		
		char c = s.charAt(0); //문자열의 첫번째 문자를 char형태로 받아들임

		for (char j=c; j>='a';j--) {
			
		for (char i='a'; i<=c;i++) {
			System.out.print(i);
	}
		c--;
		System.out.println();
		
	}
		scanner.close();

}
}
