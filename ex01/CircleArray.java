package ex01;

class Circle01{
	int radius;
	public Circle01(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}
public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle01 [] c;
		c = new Circle01[5];
		
		for(int i=0; i<c.length;i++)
		{
			c[i]= new Circle01(i);
		}
		for(int i=0; i<c.length;i++) {
			System.out.print((int)(c[i].getArea())+" ");
		}
		

	}

}
