
public class Ballooon {
	String color;
	double price;
	int size;
	 
	void Balloon()
	{
	System.out.println("default");
	}
	void Balloon(String color)
	{
	System.out.println("single");
	}
	void Balloon(String color,int size)
	{
	System.out.println("two");
	}
	void Balloon(String color,int size,double price)
	{
	System.out.println("three");
	}
}
