class Counter2 {
	int count = 0;
	
	public void increment() {
		synchronized(this) {    //����ȭ ���
			count++;
		}
	}
	public void decrement() {
		synchronized(this) {
			count--;
		}
	}
	public int getCount() {return count;}
}

public class B3_MutualAccessSyncBlock {
	public static Counter2 cnt = new Counter2();
	
	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = () -> {
			for(int i=0; i<1000; i++)
				cnt.increment();    //���� 1 ����
		};
		
		Runnable task2 = () -> {
			for(int i=0; i<1000; i++)
				cnt.decrement();    //���� 1 ����
		};
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		t1.join();    //�����尡 ���������� ��ٷ��� �� ������ ������ �ϰڴ�.
		t2.join();    //t2�� �����ϴ� �������� ���Ḧ ��ٸ�
		// �����尡 ����Ǹ� ����� ������. �� join�� ����
		System.out.println(cnt.getCount());
	}
}

