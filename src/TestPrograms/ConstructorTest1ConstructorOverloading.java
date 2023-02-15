package TestPrograms;
class ConstructorTest1
{
	ConstructorTest1(int x,int y)
	{
		int Res=x+y;
		System.out.println ("Additoion Result: " +Res);		
	}
	ConstructorTest1(int x, double y)
	{
		double res=x*y;
		System.out.println ("Multiplication Result: " +res);		
	}
}
public class ConstructorTest1ConstructorOverloading{
	public static void main (String [] args){
		ConstructorTest1 obj1=new ConstructorTest1(10,3.5);
		ConstructorTest1 obj=new ConstructorTest1(10,20);
	}
}