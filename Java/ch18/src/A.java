import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class A
{
	public static void main(String[] args)
	{
		path file = Paths.get("c:\\javastudy\\simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);
			writer.write('A');
			writer.write('Z');
			
			if(writer != null)
				writer.close();
		}
		catch(IOException e)    
		{
			e.printStackTrace();    //Exception을 상속하는 예외는 반드시 처리를 해야한다.
		}                           //그렇지 않으면 컴파일 오류로 이어진다.
	}
}
