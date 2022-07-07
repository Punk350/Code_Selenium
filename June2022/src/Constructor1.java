
public class Constructor1 
	{
	public Constructor1()
	{
		this(1,1,1);
		System.out.println("Default");
	}
	
	public Constructor1(int a)
	{
		this();
		System.out.println("1 Parameterized");
	}
	
	public Constructor1(int a, int b)
	
	{
		this(1);
		System.out.println("2 Parameterized");
	}
	
	public Constructor1(int a, int b ,int c)
	{
		System.out.println("3 Parameterized");
	}
	
	public Constructor1(int a, int b, int c, int d)
	{
		this(2,3);
		System.out.println("4 Parameterized");
	}
	
	public static void main(String[] args) 
	{
		Constructor1 P = new Constructor1(1,2,3,4);
	}
	
	
}
