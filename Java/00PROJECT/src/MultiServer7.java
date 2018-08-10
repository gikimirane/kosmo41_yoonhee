import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MultiServer7 {

	ServerSocket serverSocket = null;
	Socket socket = null;
	Map<String, PrintWriter> clientMap;

	// ������
	public MultiServer7() {
		// Ŭ���̾�Ʈ�� ��½�Ʈ���� ������ �ؽ��� ����
		clientMap = new HashMap<String, PrintWriter>();
		// �ؽ��� ����ȭ ����
		Collections.synchronizedMap(clientMap);
	}

	public void init() {
		try {
			// 9999��Ʈ�� �������� ��ü ����
			serverSocket = new ServerSocket(9999);
			System.out.println("������ ���۵Ǿ����ϴ�.");

			while (true) {
				socket = serverSocket.accept();
				System.out.println(socket.getInetAddress() + ":" + socket.getPort());

				Thread mst = new MultiServerT(socket); // ������ ����
				mst.start(); // ������ �õ�
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// ������ ����Ʈ ������
	public void list(PrintWriter out) {
		// ��½�Ʈ���� ���������� ���ͼ� �ش� �޽����� ����Ѵ�.
		Iterator<String> it = clientMap.keySet().iterator();
		String msg = "����� ����Ʈ [";
		while (it.hasNext()) {
			msg += (String) it.next() + ",";
		}
		msg = msg.substring(0, msg.length() - 1) + "J";
		out.println(msg);
	}

	// ���ӵ� ��� Ŭ���̾�Ʈ�鿡�� �޽����� ����
	public void sendAllMsg(String user, String msg) {
		// ��½�Ʈ���� ���������� ���ͼ� �ش� �޽����� ����Ѵ�.
		Iterator<String> it = clientMap.keySet().iterator();

		while (it.hasNext()) {
			try {
				PrintWriter it_out = (PrintWriter) clientMap.get(it.next());
				if (user.equals(""))
					it_out.println(msg);
				else
					it_out.println("[" + user + "]" + msg);
			} catch (Exception e) {
				System.out.println("����:" + e);
			}
		}
		
		int start = msg.indexOf("") +1;
		int end = msg.indexOf("", start);
		
		if(end != -1) {
			String to = msg.substring(start, end);
			String msg2 = msg.substring(end+1);
			Object Obj = hm.get(to);
			if(Obj != null) {
				PrintWriter pw = (PrintWriter)Obj;
				pw.println(s_name + "���� �ӼӸ��� �����̽��ϴ�. :" + msg2);
				pw.flush();
			}
		}
	}
//	public void broadcast(String msg) {
//		synchronized(hm) {
//			Collection<E> collection = hm.values();
//			Iterator iter = collection.iterator();
//			while(iter.hasNext()) {
//				PrintWriter pw = (PrintWriter)iter.next();
//				pw.println(msg);
//				pw.flush();
//			}
//		}
//	}

	public static void main(String[] args) {

		// ������ü ����
		MultiServer7 ms = new MultiServer7();
		ms.init();
	}
	// ���� Ŭ����
	// Ŭ���̾�Ʈ�κ�ó �о�� �޼����� �ٸ� Ŭ���̾�Ʈ(socket)�� ������ ������ �ϴ� �޼ҵ�

	class MultiServerT extends Thread {

		Socket socket;
		PrintWriter out = null;
		BufferedReader in = null;

		// ������
		public MultiServerT(Socket socket) {
			this.socket = socket;
			try {
				out = new PrintWriter(socket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			} catch (Exception e) {
				System.out.println("����: " + e);
			}
		}

		// �����带 ����ϱ� ���ؼ� run()�޼ҵ� ������
		@Override
		public void run() {
			// String s = "";
			String name = ""; // Ŭ���̾�Ʈ�κ��� ���� �̸��� ������ ����
			try {
				name = in.readLine(); // Ŭ���̾�Ʈ���� ó������ ������ �޽����� Ŭ���̾�Ʈ�� ����� �̸��̴�.

				sendAllMsg("", name + "���� �����ϼ̽��ϴ�.");
				// ���� ��ü�� ������ �ִ� ������ �����ϰ� �ٸ� ����(Ŭ���̾�Ʈ)�鿡�� ������ �˸�.
				clientMap.put(name, out); // �ؽ��ʿ� Ű�� name���� ��½�Ʈ�� ��ü�� ����.
				System.out.println("���� ������ ����" + clientMap.size() + " ���Դϴ�.");

				// �Է½�Ʈ���� null�� �ƴϸ� �ݺ�
				String s = "";
				while (in != null) {
					s = in.readLine();
					System.out.println(s);
					// if (s.equals("q") || s.equals("Q"))
					// break;
					if (s.equals("/list"))
						list(out);
					else
						sendAllMsg(name, s);
				}

				// System.out.println("Bye...");
			} catch (Exception e) {
				System.out.println("����: " + e);
			} finally {
				// ���ܰ� �߻��Ҷ� ����. �ؽ��ʿ��� �ش� ������ ����
				// ���� �����ϰų� ������ java.net.SocketException: ���ܹ߻�
				clientMap.remove(name);
				sendAllMsg("", name + "���� �����ϼ̽��ϴ�.");
				System.out.println("���� ������ ����" + clientMap.size() + "�� �Դϴ�.");

				try {
					in.close();
					out.close();

					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}