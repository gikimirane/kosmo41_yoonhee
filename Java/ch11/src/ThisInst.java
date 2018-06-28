class SimpleBox {
	private int data;
	
	SimpleBox(int data) {
		this.data = data;
	}
	
	void setDate(int data) {
		this.data = data;
	}
	int getData() {
		return this.data;
	}
}

public class ThisInst 
{
	public static void main(String[] args)
	{
		SimpleBox box = new SimpleBox(99);
		System.out.println(box.getData());
		
		box.setDate(77);
		System.out.println(box.getData());		
	}
}
