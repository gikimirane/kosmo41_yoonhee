class Point2 implements Cloneable
{
	private int xPos;
	private int yPos;
	
	public Point2(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	public void showPosition()
	{
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	public void changePos(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class Rectangle implements Cloneable
{
	public Point2 upperLeft;
	public Point2 lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2)
	{
		upperLeft = new Point2(x1, y1);
		lowerRight = new Point2(x1, y2);
	}
	public void changePos(int x1, int y1, int x2, int y2)
	{
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public void showPosition()
	{
		System.out.print("좌측 상단: ");
		upperLeft.showPosition();
		
		System.out.print("우측 상단: ");
		lowerRight.showPosition();
		System.out.println();
	}
}

public class ShallowCopy
{
	public static void main(String[] args)
	{
		Rectangle org = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;
		
		try {
			cpy = (Rectangle)org.clone();    //인스턴스 복사
			org.changePos(2, 2, 7, 7);    //한 인스턴스의 좌표 정보를 수정
			org.showPosition();
			cpy.showPosition();
			
			if(org.equals(cpy))
				System.out.println("aaaaa.");
			else
				System.out.println("bbbbbb.");
			
			if(org.lowerRight.equals(cpy.lowerRight))
				System.out.println("ccccc.");
			else
				System.out.println("ddddd.");
		}
		
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}