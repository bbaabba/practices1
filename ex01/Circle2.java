package ex01;

public class Circle2{
	int radius;
	String name;
	
	public Circle2() {
		radius = 1; name = ""; //입력값이 없으면 대체
		
	}
	public Circle2(int r, String n) {
		radius = r; name = n;
		
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 pizza = new Circle2(10,"자바피자"); //Circle2에 10, 자바피자를 입력
		
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은"+area);
		
		Circle2 donut = new Circle2();			//입력값 없음
		donut.name = "도넛피자";					//donut.name에 도넛피자 입력
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은"+area);

	}

}
