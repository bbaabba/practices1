package ex01;

import java.util.*;
public class CollectionsEx {

	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) { //hasNext() : true or false로 값을 가져옴
			String e = iterator.next();
			String separator;
			if (iterator.hasNext()) {
				separator = "->";
			}
			else {
				separator = "\n";
			}
		System.out.print(e+separator);
			
				
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터"); //0이랑 2는 뭐에쓰는거지?
		myList.add(2,"아바타");
		
		Collections.sort(myList); //사전편찬순으로 정렬
		printList(myList);
		
		Collections.reverse(myList); //거꾸로 정렬
		printList(myList);
		
		int index = Collections.binarySearch(myList,"매트릭스",Collections.reverseOrder())+1;
		System.out.println("아바타는 "+index+"번째 요소입니다");

	}

}
