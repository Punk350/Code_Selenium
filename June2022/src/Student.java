
public class Student {
	int age;
	int rollno;
	
	public void Pankaj1()
	{
		System.out.println("Welcome students");
	}
	public void Pankaj2()
	{
		System.out.println("automation is very easy");
	}
	
	public static void main(String[] args) 
	{
	
	Student P1 = new Student();
	P1.Pankaj1();
	P1.Pankaj2();
	P1.age=25;
	System.out.println(P1.age);
	P1.rollno=11;
	System.out.println(P1.rollno);
	
	}
	
}

