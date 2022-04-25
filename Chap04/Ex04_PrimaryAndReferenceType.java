package Chap04;

import java.util.Arrays;

public class Ex04_PrimaryAndReferenceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1. 기본 자료형의 대입 연산
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println();
		//#2. 참조 자료형의 대입 연산
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1;//array2가 참조하는 값은 array1의 값과 같다(새로 값을 만든게 아님) 
		System.out.println(Arrays.toString(array1));
		array2[0] = 7; //array2의 값을 변경한걸로 array1에도 영향이 감
		System.out.println(Arrays.toString(array1)); //얘 0번값은 왜 7이되는가?
		System.out.println(Arrays.toString(array2));
		
	}

}
