package part3.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\test/sample.txt");
		String s = "I love cricket so much, not volleyball";
		fw.write(s);
		fw.close();
		System.out.println("Writing into the file successfully");
	}
}
