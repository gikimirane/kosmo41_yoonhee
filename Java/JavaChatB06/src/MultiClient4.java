import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiClient4 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("�̸��� �Է��� �ּ���.");
		Scanner s = new Scanner(System.in);
		String s_name = s.nextLine();
		
		PrintWriter out = null;
		
		try {
			String ServerIP = "localhost";
			Socket socket = new Socket(ServerIP, 9999); //���� ��ü ����
			System.out.println("������ ������ �Ǿ����ϴ�......");
			
			//�������� ������ �޽����� ������� �ֿܼ� ����ϴ� ������
			Thread receiver = new Receiver4(socket);
			receiver.start();
			
			out = new PrintWriter(socket.getOutputStream(), true);
			
			out.println(s_name);
			
			while(out != null) {
				try {
					String s2 = s.nextLine();
					if(s2.equals("q") || s2.equals("Q")) {
						out.println(s2);
						break;
					} else {
						out.println(s_name + "=>" + s2);
					}
				} catch(Exception e) {
					System.out.println("����:" + e);
				}
			}

			out.close();
			
			socket.close();
			
		} catch(Exception e) {
			System.out.println("����[Multiclient class]:"+e);
		}
	}
}