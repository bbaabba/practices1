package ex01;
import java.util.Scanner;    //Scanner라는 객체를 사용하기 위해 java.util에서 불러들임(import함)

public class ScannerEx {
	public static void main(String args[] ) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부(true or false)를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);    //Scanner 클래스를 만들어야하기때문에 이 문장이 제일 선행되어야함
													//이 밑은 나열이 바뀌는건 큰 상관이 없음
		String name = scanner.next();    //name 변수 설정 및 문자열 읽기
		System.out.print("이름은"+name+",");
		
		String city = scanner.next();   //city
		System.out.print("도시는"+city+",");
		
		int age = scanner.nextInt();    //age
		System.out.print("나이는"+age+"살,");
		
		double weight = scanner.nextDouble();  //weight <실수로 읽을거라 double을 사용
		System.out.print("체중은"+weight+"kg,");
		
		boolean single = scanner.nextBoolean(); //true 나 false값만 받을것이기에 boolean사용
		System.out.println("독신 여부는"+single+"입니다.");

		scanner.close(); //close를 안해도 가비지컬렉터에서 알아서 처리해주긴하는데 왠만하면 닫아라
		
		
	}

}
