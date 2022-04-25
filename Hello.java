package ex01;
/*소스파일 : Hello.java  (클래스명과 파일명이 다르면 에러가 난다)        */
public class Hello {//관념적으로 클래스명은 대문자로 시작
//sum() 메소드 시작
	public static int sum(int n, int m) {   //sum()에 어떻게 정수값을 입력할것인가
		return n + m;              //sum()이 어떤 결과값을 가져올것인가
	}
//main() 메소드에서 실행 시작
	public static void main(String[] args/*여기 다시 봐야함*/) { //main은 프로그램의 시작, system의 호출 필요
		//지역 변수 설정			변수선언->변수초기화->사용
		int i = 20;        //i에 20이라는 숫자를 선언한다(type결정 및 메모리 할당)
		int s;             //s에 미지수를 선언한다
		char a;            //a에 문자를 선언한다
		s = sum(i,10);     //sum() 메소드 호출      = 는 입력을 위한 연산자(대입연산자) ==가 같다라는 뜻 (call by value)
		a = '?';           //a에 ?라는 문자를 설정한다 문자(char)는 '' 문자열(string)은 ""
		System.out.println(a);   //a출력
		System.out.println("hello"); // hello출력
		System.out.println(s);     //s출력	
		
	}
}//public class Hello 종료


//해석은 위에서 밑으로. 시작은 main에서.
