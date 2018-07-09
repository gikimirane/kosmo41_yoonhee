import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A1_Write7FromFile {
	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("data.dat");
		out.write(65);    //ASCII ÄÚµå 65 = 'A'
		out.close();
	}
}