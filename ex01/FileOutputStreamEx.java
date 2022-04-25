package ex01;
import java.io.*;
public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b[] = {7,51,3,4,-1,24};
		
		try {
			FileOutputStream fout = 
					new FileOutputStream("c:\\tem\\test.out");
			for(int i=0; i<b.length; i++) {
				fout.write(b[i]);

			}
			fout.close();
			}
			catch(IOException e) {
				System.out.println("c:\\tem\\test.out에 저장할 수 없었습니다. 경로명을 화인해주세요");
				return;
			}
			System.out.println("c:\\tem\\test.out을 저장하였습니다.");
		}

	}


