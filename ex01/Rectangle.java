package ex01;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;

	public int getArea() {		
		return width*height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect= new Rectangle();    //public class Rectangle 안에 public Rectangle을 추가하면 Rectangle rect; rect = new Rectangle;로 대체가능
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		
		rect.width = scanner.nextInt();
		rect.height= scanner.nextInt();
		
		System.out.println("사각형의 면적은"+rect.getArea());
		scanner.close();
		

	}

}
