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
			e.printStackTrace();    //Exception�� ����ϴ� ���ܴ� �ݵ�� ó���� �ؾ��Ѵ�.
		}                           //�׷��� ������ ������ ������ �̾�����.
	}
}
