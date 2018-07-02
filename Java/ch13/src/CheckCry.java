interface Cry
{
	void cry();
}

class Cat implements Cry
{
	public void cry()
	{
		System.out.println("�߿�~");
	}
}
class Dog
{
	public void cry()
	{
		System.out.println("�۸�~");
	}
}
public class CheckCry
{
	public static void main(String[] args)
	{
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		if(cat instanceof Cry)
		{
			cat.cry();
		}
		if(dog instanceof Cry)
		{
			dog.cry();
		}
	}
}