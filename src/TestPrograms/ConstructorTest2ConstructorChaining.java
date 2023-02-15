package TestPrograms;
class ConstructorTest2
{
	ConstructorTest2(int x,int y)
	{
		int Res=x+y;
		System.out.println ("Additoion Result: " +Res);		
	}
	ConstructorTest2(int x, double y)
	{
		this(10,30);
		double res=x*y;
		System.out.println ("Multiplication Result: " +res);		
	}
}
public class ConstructorTest2ConstructorChaining{
	public static void main (String [] args){
	ConstructorTest2 obj=new ConstructorTest2(10,20.5);
	}
}