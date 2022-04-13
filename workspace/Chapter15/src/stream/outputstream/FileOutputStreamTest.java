package stream.outputstream;

import java.io.FileOutputStream;

public class FileOutputStreamTest {
	
	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		byte data = 65;
		for (int i = 0; i < bs.length; i++) {
			bs[i] = data++;
		}
		
		try (FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(bs, 2 ,10);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
		
	}
	
}
