//((((10/2)-2)-2)+2)*2)

public class Airthmatic2 
{	
		public int sum (int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
		public int sub(int a, int b)
	{
		int c;
		c=a-b;
		return c;
	}
		public int mul(int a, int b) 
	{
		int c;
		c=a*b;
		return c;
	}
		public int div(int a, int b)
	{
		int c;
		c=a/b;
		return c;
	}
		public static void main(String[] args) 
		{
			Airthmatic2 R= new Airthmatic2();
			int ResDiv = R.div(10, 2);
			int ResSub1 = R.sub(ResDiv, 2);
			int ResSub2 = R.sub(ResSub1, 2);
			int ResSum = R.sum(ResSub2, 2);
			int Result = R.mul(ResSum, 2);
			
			System.out.println("Result is "+ Result);
			}
}
