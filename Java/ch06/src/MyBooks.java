
public class MyBooks
{
	int price;
	String title;
	
	MyBooks(String t, int p)
	{
		title = t;
		price = p;
	}
	
	//���� ������
	MyBooks(MyBooks copy)
	{
		title = copy.title;
		price = copy.price;
	}
	
	void print()
	{
		System.out.println("���� : " + title);
		System.out.println("���� : " + price);
		
	}

}

class Book
{
	public static void main(String[] args)
	{
		MyBooks books1 = new MyBooks("���ӽ���", 10000);
		books1.print();
		
		Mybooks books2 = new MyBooks(books1);
		books2.title = "����ϰ���";
		books2.print();
	}
}

