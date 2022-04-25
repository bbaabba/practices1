package Chap04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex03_InitialValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1.stack 메모리값(강제 초기화 되지 않음)
		int value1;
		
		//System.out.println(value1); //value1값이 정해지지 않았는데 print를 요청하여 오류가 남
		//int [] value2;
		//System.out.println(value2); //value1과 마찬가지로 값이 안정해짐
		
		int value3 = 0;
		System.out.println(value3);
		int[] value4 = null;
		System.out.println(value4);// null값이 출력됨
		System.out.println();
		
		//#2. heap 메모리의 초기값(강제초기화)
		//@기본자료형 배열
		boolean[] array1 = new boolean[3]; //false로 초기화함(값을 정하지 않아 boolean의 default값인 false가 들어감)
		for(int i=0; i<3; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		
		int[] array2 = new int[3]; //0으로 초기화(값을 정해주지 않아 int의 default값인 0이 들어감)
		for(int i=0; i<3; i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();

		double[] array3 = new double[3];//0.0으로 초기화
		for(int i=0; i<3; i++) {
			System.out.print(array3[i]+" ");
		}
		System.out.println();
		//@참조자료형 배열
		String[] array4 = new String[3]; //null로 초기화
		for(int i=0; i<3; i++) {
			System.out.println(array4[i]+" ");
		}
		System.out.println();
		System.out.println();
		//배열을 쉽게 출력할 수 있는 방법
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
	}

}
