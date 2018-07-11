class Counter {
	int count = 0;
	
	public void increment() {
		count++;
	}
	public void decrement() {
		count--;
	}
	public int getCount() {return count;}
}

public class B1_MutualAccess {
	public static Counter cnt = new Counter();
	
	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = () -> {
			for(int i=0; i<1000; i++)
				cnt.increment();    //값을 1 증가
		};
		
		Runnable task2 = () -> {
			for(int i=0; i<1000; i++)
				cnt.decrement();    //값을 1 감소
		};
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		t1.join();    //쓰레드가 끝날때까지 기다려라 그 다음에 동작을 하겠다.
		t2.join();    //t2이 참조하는 쓰레드의 종료를 기다림
		// 쓰레드가 종료되면 출력을 진행함. 위 join의 영향
		System.out.println(cnt.getCount());
	}
}