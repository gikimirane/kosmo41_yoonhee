interface Printable1
{
	public void print(String doc);
}

class SPrinterDriver implements Printable1
{
	public void print(String doc)
	{
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable1
{
	public void print(String doc)
	{
		System.out.println("From LG printer");
		System.out.println(doc);
	}

	public static void main(String[] args)
	{
		String myDoc = "This is a reprot about...";
		
		//�Ｚ �����ͷ� ���
		Printable1 prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		//LG �����ͷ� ���
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}
}
