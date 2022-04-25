package ex01;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = 2; //2 넣기
		int n = scanner.nextInt();//입력받은 값1
		int m = scanner.nextInt();//입력받은 값2
		int temp01 [] = new int[n]; //2부터 n까지의 모든 자연수를 배열에 넣기(for반복구문)
		int temp02 [] = new int[m]; //2부터 m까지의 모든 자연수를 배열에 넣기(for반복구문)
//		int temp03 [] = new int[n]; //나중에 리턴받는걸로 고치자
//		int temp04 [] = new int[m];
		
		for (int i=0; i<temp01.length-1;i++) {
			temp01[i]=i+2;
			}
		for (int i=0; i<temp02.length-1;i++) {
			temp02[i]=i+2;
			}
		int counter=0;

		for (int i=0; i<temp01.length-1;i++) {
			for(int j=0; j<temp01.length-1;j++) {
				if(temp01[j]%a==0) {
					temp01[j]=0;					
				}
			}
			if (temp01[i]!=0) {
				counter++;
				a=temp01[i];
				}

			int [] temp03 = new int [counter];
			

		}
		System.out.println("소수의 갯수는"+counter);
		System.out.println("소수는");
/*		for (int num01:temp01) {
			System.out.println(num01);

	}*/
	

		}
			

//			소수의 갯수 = counter
		
		}
					
			
		


		//[temp[0]인 값을 a에 넣기 <이걸 반복, temp.length01,02==0이 되면 멈춤(while i!=templength)
		//temp01,02에 모든 요소에 2를 나누고 %==0인 값을 제거하기
		//temp03에 01의 0번값인 a의 배열을 넣기
		//temp04에 02의 0번값인 a의 배열을 넣기]
		//if, else length temp 03 04 비교하기, 비교한 값을 
	


	
	


