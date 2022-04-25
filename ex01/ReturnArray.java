package ex01;

public class ReturnArray {

	static int[] makeArray() { //부정형 배열 makeArray()를 생성
		int temp[] = new int[4]; //temp정의 및 temp에 크기 4의 배열 생성
		for (int i=0; i<temp.length;i++) //총 4번 반복
			temp[i] = i;  //배열의 원소를 0,1,2,3으로 초기화
		return temp; //배열 리턴 < temp에 입력했던 배열과 배열값을 부정형 배열 makeArray()에 대입
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int intArray[];
		intArray = makeArray();
		for (int i=0; i<intArray.length;i++)
			System.out.print(intArray[i]+" ");
		
		

	}

}
