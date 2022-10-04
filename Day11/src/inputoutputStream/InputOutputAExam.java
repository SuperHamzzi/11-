package inputoutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputAExam {
	public static void main(String[] args) {

	try {
	InputStream is = new FileInputStream(".\\test\\abc.txt");  // ./test/abc.txt
	OutputStream os = new FileOutputStream(".\\tes\\bcd.txt"); // ./test/bcd.txt
	
	byte[] data = new byte[1024];
	while(true) {
		int num = is.read(data);
		if(num == -1) { break;}
		os.write(num);
	}
	os.flush();
	os.close();
	os.
	
	
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}catch(Exception e) {  
		e.printStackTrace(); //확인 후 주석처리;
	}



	
	}
	}
