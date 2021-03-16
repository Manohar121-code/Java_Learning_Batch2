package part3.fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\test/sample.txt");
		
		int i;
		
		i = fr.read();
		while (i != -1) {
			char ch = (char) i;
			System.out.print(ch);
			i = fr.read();
		}
		fr.close();
	}
}
