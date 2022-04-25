package ex01;
import java.io.*;
public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fin = null; //fin에 일단 null값을 입력
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			int c;
			while((c=fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		}

		catch (IOException e) {
			System.out.println("입출력 오류");  //io에서는 오류가 자주남 > 꼭 Exception 처리를 해줘야함
		}
	}

}
