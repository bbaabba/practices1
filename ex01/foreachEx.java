package ex01;

public class foreachEx {
	enum Week {월,화,수,목,금,토,일}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = {1,2,3,4,5};
		String names[]= {"사과","배","바나나","체리","딸기","포도"};
		
		int sum = 0;
		for (int k : n) {
			System.out.print(k + " "); //반복되는 k값 출력(for문이 실행될때마다 k에 n배열에 입력되어있는값을 차례대로 낸다)
			sum += k;
			
		}
		System.out.println("합은"+sum);
		
		for (String s : names) {           //s변수에 스트링을 부여하고 names에 들어간 함수값을 일일히 대입함
			System.out.print(s+" ");
		}
		System.out.println();
		
		for(Week day : Week.values()) {
			System.out.print(day+"요일");
		System.out.print(" ");
		}
		
			

	}

}
