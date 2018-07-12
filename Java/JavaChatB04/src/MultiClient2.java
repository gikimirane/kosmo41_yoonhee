import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MultiClient2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("�̸��� �Է��� �ּ���.");
		Scanner s = new Scanner(System.in);
		String s_name = s.nextLine();
		
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			String ServerIP = "localhost";
			Socket socket = new Socket(ServerIP, 9999); //���� ��ü ����
			System.out.println("������ ������ �Ǿ����ϴ�......");
			
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream() ));
			
			out.println(s_name);
			
			while(out != null) {
				try {
					if(in != null) {
						System.out.println("Receive : " + in.readLine());
					}
					String s2 = s.nextLine();
					if(s2.equals("q") || s2.equals("Q")) {
						out.println(s2);
						break;
					} else {
						out.println(s_name + "=>" + s2);
					}
				} catch(IOException e) {
					System.out.println("����:" + e);
				}
			}
			
			in.close();
			out.close();
			
			socket.close();
			
		} catch(Exception e) {
			System.out.println("����[Multiclient class]:"+e);
		}
	}
}