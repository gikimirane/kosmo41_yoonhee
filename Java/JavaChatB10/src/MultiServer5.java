import java.io.*;
import java.net.*;

public class MultiServer5 {
	static ServerSocket serverSocket = null;
	static Socket socket = null;
	
	// ������
	public MultiServer5() {
	}
	
	public void init() {
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("������ ���۵Ǿ����ϴ�.");
			
			while(true) {
				socket = serverSocket.accept();
				System.out.println(socket.getInetAddress() + ":" + socket.getPort());
				
				Thread msr = new MultiServerT(socket);   // ������ ����
				msr.start();    // ������ �õ�
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// ������ü ����
		MultiServer5 ms = new MultiServer5();
		ms.init();
		}
	
	// ���� Ŭ����
	// Ŭ���̾�Ʈ�κ��� �о�� �޽����� �ٸ� Ŭ���̾�Ʈ(socket)�� ������ ������ �ϴ� �޼ҵ�
	
	class MultiServerT extends Thread {
		Socket socket;
		PrintWriter out = null;
		BufferedReader in = null;
		
		// ������
		public MultiServerT(Socket socket) {
			this.socket = socket;
			try {
				out = new PrintWriter(socket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(socket.getInputStream() ));
			} catch(Exception e) {
				System.out.println("����: " +e);
			}
		}
		// �����带 ����ϱ� ���ؼ� run()�޼ҵ� ������
		@Override
		public void run() {
			String s = "";
			try {
				while(in != null) {
					s=in.readLine();
					if(s==null)
						break;
					if(s.equals("q") || s.equals("Q"))
						break;
					
					System.out.println(s);
					sendAllMsg(s, out);
				}
				System.out.println("Bye...");
			} catch(Exception e) {
				System.out.println("����: " +e);
			} finally {
				try {
					in.close();
					out.close();
					
					socket.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		// ���ӵ� ��� Ŭ���̾�Ʈ�鿡�� �޽����� ����
		public void sendAllMsg(String msg, PrintWriter out) {
			try {
				out.println(msg);
			} catch(Exception e) {
				System.out.println("����: "+ e);
			}
		}
	}
}
