package ex01;
import java.util.*;
public class RockScissorPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("<<가위, 바위, 보 게임>>");
		while(true) {
		System.out.println("1)가위, 2)바위, 3)보");
		System.out.print("선택하세요 : ");
		
		int inputnum = scanner.nextInt();
		int a = random.nextInt(3)+1; //random > 1,2,3 랜덤 inputnum이
		if (a == 3&&inputnum==1) {
			inputnum += 3;
		}
		else if (a==1&&inputnum==3) {
			a += 3;			
		}
		if (inputnum == a) {
			System.out.println("컴퓨터의 가위바위보 값은 "+a+"입니다");
			System.out.println("비겼습니다");
		}
		else if (inputnum - a == 1) {
			System.out.println("컴퓨터의 가위바위보 값은 "+a+"입니다");
			System.out.println("졌습니다");			
		}
		else if (inputnum - a == -1) {
			System.out.println("컴퓨터의 가위바위보 값은 "+a+"입니다");
			System.out.println("이겼습니다");				
		}
		
		System.out.print("1)다시하기, 2)게임종료");	
		int replay = scanner.nextInt();
		if (replay == 2) {
			System.out.println("게임을 종료합니다");
			break;		
		}

	}

		scanner.close();
}
}
