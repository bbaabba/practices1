package Chap06;

import java.util.Arrays;

public class Ex05_ArrayArgumentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int [] {1,2,3};
		printArray(a);
		printArray(new int[] {1,2,3});
//		printArray({1,2,3});    <<이건 오류발생함

	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}

}
