package ex01;
import java.util.Vector;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer> v = new Vector <Integer>();


		v.add(5);//0번에 5
		v.add(4);//1번에 4
		v.add(-1);//2번에 -1
		
		v.add(2,100);//2번에 100, -1은 3번으로 밀림
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		System.out.println("벡터의 현재 용량 : " + v.capacity()); //default값이 10이라 따로안정해줘서 10
		
		for (int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for (int i=0; i<v.size();i++) {
			int n = v.elementAt(i);//get과 차이가 없는 명령어
			sum += n;
			
		}
		
		System.out.print("벡터에 있는 정수 합 : "+sum);
	}

}
