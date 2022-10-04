package inputoutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExam {

	public static void main(String[] args) {
		File outFile = new File(".\\test\\bcd.txt");
		
		try {
			OutputStream os = new FileOutputStream(outFile);
//			OutputStream os = new FileOutputStream(outFile, true);
			
			os.write('j');
			os.write('a');
			os.write('v');
			os.write('a');
			os.write('!');
			
			os.flush(); //FileOutPutStream은 내부적으로 메모리 버퍼를 사용하지 않아 생략가능
						//그러나 넣는 방향으로...
						//내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
						//내부 버퍼를 사용하는 이유
			os.close(); //출력 스트림을 닫아 사용한 메모리를 해제
		}catch(IOException e) {
			System.out.println("출력 에러");
//			e.printStackTrace(); 확인후에 반드시 주석처리하거나 또는 제거
		}catch(Exception e) {
		}

	}

}
