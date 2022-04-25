package ex01;
import java.util.Scanner;
public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5]; //intArray에 5개 크기의 배열 생성(하나의 배열은 int(4bit)만큼의 크기를 가진다)
		
		int max=0;					// max에 0의 값을 배정
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<5;i++) {					//총 5번의 연산을 실행(i=0,1,2,3,4)
			intArray[i] = scanner.nextInt();	//첫번째에 0, 두번째에 1... 다섯번째에 4의 배열값에 값을 입력받음(intArray[i]라는 함수가 영리하다 0부터 나오는 숫자를 배열에 바로 대입시켜버림 만약 i가 1부터 시작했다면 0번째 배열에 아무 값도 들어가지 않을것)
		if(intArray[i] > max)					//intArray에 입력받은 값이 max값보다 클 경우에 실행
			max = intArray[i];					//max에 intArray에 들어온 값을 입력
		}
		
		System.out.print("가장 큰 수는"+max+"입니다"); //총 5번 실행중 max에 입력된 값을 출력
		scanner.close();

	}

}
