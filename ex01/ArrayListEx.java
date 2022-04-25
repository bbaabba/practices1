package ex01;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner (System.in);
		for (int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요 >>");
			String s = scanner.next(); //s에 이름 입력
			a.add(s); //입력받은 s를 ArrayList 인 a에 추가
			
		}
		for (int i=0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		
		int longestIndex = 0;
		for (int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length()<a.get(i).length()) {
				longestIndex = i;
			}
		}
		System.out.print("\n가장 긴 이름은 :"+a.get(longestIndex));
		scanner.close();

	}

}
