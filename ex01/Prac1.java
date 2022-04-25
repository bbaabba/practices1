package ex01;
public class Prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i=1;i<6;i++) {
			for (int j=1;j<10;j++) {
				
				if (i+j==6 || j-i==4 || i==5) {			//우상향, 우하향대각선+i=5에 *입력
						System.out.print("*");	
			}
				else						//해당사항이 없는 부분에 공백을 입력
					System.out.print(" ");
			}
			System.out.print('\n');				//하나의 열에 데이터의 입력이 완료되면 행을 옮김
		}		
	}
}
		
/*		for문은 열보다는 행의 갯수를 먼저 고려하는게 맞다
		텍스트 처리의 특성상 먼저 행을 정하고 그 행의 처리를 끝내야 다음 행으로 이동이 가능하기 때문에
		열을 어떻게 만들지 생각하지 말고 한칸한칸 채워나간 뒤 다음 행을 채워나간다는 식으로 생각하는게 훨씬 생각하기 편함
			
	*/		
