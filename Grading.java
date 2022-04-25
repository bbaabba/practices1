package ex01;
import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		if (score>90)
			grade = 'A';
			else if (score >=80)
				grade = 'B';
			else if (score >=70)
				grade = 'C';
			else if (score >=60)
				grade = 'D';
			else
				grade = 'F';
		System.out.printf("학점은 %s 입니다.", grade);
		scanner.close();
		

	}

}
