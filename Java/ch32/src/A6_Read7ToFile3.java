import java.io.*;
import java.io.IOException;

public class A6_Read7ToFile3 {
	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("data.dat")) {
			int dat = in.read();
			System.out.println(dat);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
