package ex01;
import java.io.*;
import java.util.*;
public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\tem\\test.txt");
			while (true) {
				String line =scanner.nextLine();
				if(line.length() ==0){
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);    //입력이 완료될때마줄을 딱딱 나눠주기 위한 함수
				
			}
			fout.close();
			
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}

		scanner.close();
	}

}
