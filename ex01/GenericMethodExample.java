package ex01;

public class GenericMethodExample {

	public static <T> GStack <T> reverse(GStack<T> a){
		GStack<T> s = new GStack<T>(); //s스택을 새로 만듦
		
		while(true) {
			T tmp;
			tmp = a.pop(); //a스택에서 요소 하나를 꺼냄
			if(tmp==null) {
				break;
			}
			else
				s.push(tmp); //새 스택에 요소를 삽입
		}
		return s;    //마지막은 s값이 나오는 클래스
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<Double> gs = new GStack<Double>();
		
		for (int i=0; i<5; i++) {
			gs.push(new Double(i));
		}
		gs = reverse(gs);
		for(int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}

	}

}
