import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class A6_CopyFIleFromFiles {
	public static void main(String[] args) throws IOException {
		Path src = Paths.get("D:\\ooh.nle\\Study\\JavaStudy\\CopyFIleFromFiles.java");
		Path dst = Paths.get("D:\\ooh.nle\\Study\\JavaStudy\\CopyFIleFromFiles2.java");
		
		//src�� �����ϴ� ������ dst�� �����ϴ� ��ġ�� �̸����� ����
		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
	}
}
