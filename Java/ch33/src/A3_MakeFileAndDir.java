import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A3_MakeFileAndDir {
	public static void main(String[] args) throws IOException {
		// Path fp = Paths.get("D:\\ooh.nle\\Study\\empty.txt");
		// fp = Files.createFile(fp);
		// System.out.println("File: " + fp);

		// Path dp1 = Paths.get("D:\\ooh.nle\\Study\\Empty");
		// dp1 = Files.createDirectory(dp1);
		// System.out.println("Dir1: " + dp1);

		Path dp2 = Paths.get("D:\\ooh.nle\\Study\\Empty");
		dp2 = Files.createDirectories(dp2);
		System.out.println("Dir2: " + dp2);
	}
}
