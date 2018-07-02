interface Animal
{
	void cry();
}

class Cat2 implements 
Animal
{
	public void cry()
	{
		System.out.println("�߿�~");
	}
}
class Dog2 implements Animal
{
	public void cry()
	{
		System.out.println("�۸�~");
	}
}
public class CheckCry2
{
	public static void main(String[] args)
	{
		Animal cat = new Cat2();
		Animal dog = new Dog2();
		
		checkAnimal(cat);
	}
		
	public static void checkAnimal(Animal animal)
	{
	    if(animal instanceof Cat2)
		{
			System.out.println("�����");
	    	animal.cry();
		} else if(animal instanceof Dog2)
		{
			System.out.println("������");
			animal.cry();
		}
	}
}