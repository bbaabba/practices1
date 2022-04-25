package Chap04;

import java.util.Arrays;

public class Ex06_RectangleArrayDefinition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1. 배열의 선언 방법1
		int[][] array1 = new int [3][4];
		int[][] array2;
		array2 = new int[3][4];
		//#2. 배열의 선언 방법2
		int array3[][] = new int [3][4];
		int array4[][];
		array4 = new int [3][4];
		//#3. 배열의 선언 방법3 이건좀헷갈리네 ㅋㅋ
		int[] array5[] = new int[3][4];
		int[] array6[];
		array6 = new int[3][4];
		//#4. 다양한 배열 선언 (기본 자료형 배열, 참조 자료형 배열
		boolean[][] array7 = new boolean[3][4];
		int[][] array8 = new int[2][4];
		double[][] array9 = new double[3][5];
		String[][] array10 = new String[2][6];
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		System.out.println(Arrays.toString(array5));
		System.out.println(Arrays.toString(array6));
		System.out.println(Arrays.toString(array7));
		System.out.println(Arrays.toString(array8));
		System.out.println(Arrays.toString(array9));
		System.out.println(Arrays.toString(array10));

	}

}
