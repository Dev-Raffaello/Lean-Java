package stream.write;

import java.io.FileWriter;

public class FileWriterTest {
	
	public static void main(String[] args) {
		
		try (FileWriter fw = new FileWriter("writer.txt")){
			fw.write("A");
			char[] ch = {'B', 'C', 'D'};
			fw.write(ch);
			fw.write("æ»≥Á«œººø‰");
			fw.write(ch, 1, 2);
			fw.write("123");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
		
	}

}
