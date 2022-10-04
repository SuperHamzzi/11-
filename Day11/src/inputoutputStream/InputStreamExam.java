package inputoutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExam {

	public static void main(String[] args) throws IOException {
		//#1. 파일 읽어오기(입력파일 생성)
		File inFile = new FileInputStream(".\\test\\abc.txt");
	
		//#2. byte단위 읽기
		InputStream is = new FileInputStream(inFile);
		int data;
		while((data = is.read()) != -1) {
		
			System.out.println(data + " " +(char)data);
		}
		
		System.out.println();
	is.close();
	}

}
