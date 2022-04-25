package ex01;
import java.util.Scanner;
public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오.");
	
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
//	System.out.printf(((100<=x && x<=200 && 100<=y && y<=200)?"(%d,%d)는 사각형 안에 있습니다.":"(%d,%d)는 사각형 안에 없습니다."),x,y,x,y);

	if (100<=x && x<=200 && 100<=y && y<=200)
		System.out.printf("(%d,%d)는 사각형 안에 있습니다.",x,y);
	else
		System.out.printf("(%d,%d)는 사각형 안에 없습니다.",x,y);
		
	
	scanner.close();
		
	}

}
