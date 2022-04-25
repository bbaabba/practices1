package Chap04;

public class Ex12_SharingStringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//#1.문자열 객체 공유 (리터럴로 객체를 생성한 경유) new 키워드로 객체 생성한 경우(별도의 객체 생성) 공유x
		
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		//new를 통해 새로운 객체를 생성함(같은 문자열이라도 주소가 달라짐)
		System.out.println(str1==str2);
		System.out.println(str2==str3);//얘만 같은 주소의 값을 가리킨다
		System.out.println(str3==str4);
		System.out.println(str4==str1);
		
	}

}
