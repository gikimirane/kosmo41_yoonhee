import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiClient6 {
	// HOST�� IP �ּҸ� ���� �� �� ������ ��쿡 Throw �˴ϴ�.
	public static void main(String[] args)
			throws UnknownHostException, IOException {    
		
		System.out.println("�̸��� �Է����ּ���.");
		// System.in���� ���ڸ� ���� �� �ֵ��� �Ѵ�.
		Scanner s = new Scanner(System.in);
		String s_name = s.nextLine();
		
		try {
			String ServerIP = "localhost";
			if (args.length > 0)
				ServerIP = args[0];
			Socket socket = new Socket(ServerIP, 9999);    //���� ��ü ����
			System.out.println("������ ������ �Ǿ����ϴ�......");
			
			// �������� ������ �޽����� ������� �ֿܼ� ����ϴ� ������
			Thread receiver = new Receiver6(socket);
			receiver.start();
			
			//����ڷκ��� ���� ���ڿ��� ������ �������ִ� ������ �ϴ� ������
//			Thread sender = new Sender6(socket, s_name);
//			sender.start();
			
			new ChatWin(socket, s_name);
			
		} catch(Exception e) {
			System.out.println("����[MultiClient class]:"+e);
		}
	}
}