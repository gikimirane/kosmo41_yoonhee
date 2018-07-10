import java.io.DataOutputStream;
import java.io.IOException;
import java.io.*;

public class C4_BufferedDataOutputStream {
	public static void main(String[] args) {
		try(DataOutputStream out =
				new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("data.dat")))) {
			out.writeInt(370);
			out.writeDouble(3.14);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
