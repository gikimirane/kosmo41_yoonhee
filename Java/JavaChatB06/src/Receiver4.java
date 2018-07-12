import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

// ������ �޼����� �����ϴ� Ŭ����
public class Receiver4 extends Thread {
	Socket socket;
	BufferedReader in = null;
	
	//Socket�� �Ű������� �޴� ������
	public Receiver4(Socket socket) {
		this.socket = socket;
		
		try {
			in = new BufferedReader(new InputStreamReader(this.socket.getInputStream() ));
		} catch(Exception e) {
			System.out.println("����: +e");
		}
	}
	//run()�޼ҵ� ������
	@Override
	public void run() {
		while(in != null) {
			try {
				/*
				 String s = in.readLine();
				 if(s.equals("q") || s.equals("Q")) {
				    break;
				 } else {
				     System.out.println("Thread Receive : " +s);
				 }
				 */
				System.out.println("Thread Receive : " + in.readLine());
			}catch(java.net.SocketException ne) {
				break;
			} catch(Exception e) {
				System.out.println("����: " +e);
			}
		}
		try {
			in.close();
		} catch(Exception e) {
			System.out.println("����3: " +e);
		}
	}
}