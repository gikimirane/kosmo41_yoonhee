class MyBook
{
	int price;
	int num = 0;
	String title = "����ϰ��ӱ���";
	
//	MyBook()
//	{
//		title = "����ϰ��ӱ���";
//		price = 5000;
//	}
	
	MyBook(String t, int p)
	{
		title = t;
		price = p;
	}
	
	void print()
	{
		System.out.println("��      �� : " + title);
		System.out.println("��      �� : " + price);
		System.out.println("�ֹ����� : " + num);
		System.out.println("�հ�ݾ� : " + price * num);
		
	}
}

class Books
{
	public static void main(String[] args)
	{
		MyBook book = new MyBook("���ӽ���", 10000);
		book.num = 10;
		book.print();
	}
}
