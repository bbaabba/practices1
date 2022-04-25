package ex01;
import java.util.Scanner;
public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오.");
		int money = scanner.nextInt();
/*
		int a = money/50000;
		money = money-a*50000;
		
		int b = money/10000;
		money = money-b*10000;
		
		int c = money/5000;
		money = money-c*5000;
		
		int d = money/1000;
		money = money-d*1000;

		int e = money/500;
		money = money-e*500;
		
		int f = money/100;
		money = money-f*100;
		
		int g = money/50;
		money = money-g*50;
		
		int h = money/10;
		money = money-h*10;
		
		int i = money;
		
		System.out.printf("5만원권 %d매",a);
		System.out.printf("1만원권 %d매",b);
		System.out.printf("5천원권 %d매",c);
		System.out.printf("1천원권 %d매",d);
		System.out.printf("500원 %d개",e);
		System.out.printf("100원 %d개",f);
		System.out.printf("50원 %d개",g);
		System.out.printf("10원 %d개",h);
		System.out.printf("1원 %d개",i);
		//won/50000 = 오만원권 갯수
		*/
		
		int a = money/50000;
		int b = (money%50000)/10000;
		int c = (money%10000)/5000;
		int d = (money%5000)/1000;
		int e = (money%1000)/500;
		int f = (money%500)/100;
		int g = (money%100)/50;
		int h = (money%50)/10;
		int i = money-(money/10)*10;
		
		System.out.printf("5만원권 %d매\n",a);
		System.out.printf("1만원권 %d매\n",b);
		System.out.printf("5천원권 %d매\n",c);
		System.out.printf("1천원권 %d매\n",d);
		System.out.printf("500원 %d개\n",e);
		System.out.printf("100원 %d개\n",f);
		System.out.printf("50원 %d개\n",g);
		System.out.printf("10원 %d개\n",h);
		System.out.printf("1원 %d개\n",i);
		
		scanner.close();
		
	}

}
