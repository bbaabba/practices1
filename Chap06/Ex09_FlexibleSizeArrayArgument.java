package Chap06;

import java.util.Arrays;

public class Ex09_FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1(1,2);
		method1(1,2,3);
		method1();
		
		method2("안녕","방가");
		method2("땡큐","배리","머치");
		method2();

	}
	
	public static void method1(int...values) {
		System.out.println("배열의 길이 : " + values.length);
		 //배열 출력 방법 1
		for (int i=0; i<values.length;i++){
			System.out.print(values[i]+" ");
		}
		 
		//배열 출력 방법 2
		for (int k : values) {
			System.out.println(k+" ");
		}
//		System.out.println(Arrays.toString(values));
		System.out.println();
	}
	
	public static void method2(String...values) {
		System.out.println("배열의 길이 : "+values.length);
	
	for(int i=0; i<values.length;i++) {
		System.out.print(values[i]+" ");
	}
	for (String k : values) {
		System.out.print(k+" ");
	}
		System.out.println(Arrays.toString(values));
	
}

}