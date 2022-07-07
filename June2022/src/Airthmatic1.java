//((((10+2)+2)-2)*2)/2)

public class Airthmatic1
{
	public int Sum(int a, int b)
	{
		int c;
		c= a+b;
		return c;
	}
	public int Sub(int x, int y)
	{
		int z;
		z=x-y;
		return z;
	}
	public int mul(int p, int q)
	{
		int r;
		r=p*q;
		return r;
	}
	public int div(int n, int m)
	{
		int o;
		o=n/m;
		return o;
	}
	public static void main(String[] args) 
	{
	Airthmatic1 k = new Airthmatic1();
	int SumResult1 = k.Sum(10,2);
	int SumResult2 = k.Sum(SumResult1,2);
	int SubResult = k.Sub(SumResult2,2);
	int MulResult = k.mul(SubResult, 2);
	int divResult = k.div(MulResult, 2);
	System.out.println("Result is " +divResult);
	}
}

