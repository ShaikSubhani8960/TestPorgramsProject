package TestPrograms;
class Method4
{
	void fibonaciForFirst15Numbers()
	{
		int FirstNumber=0;
		int SecondNumber=1;
		int ThirdNumber;
		System.out.print (FirstNumber+" "+SecondNumber);
		for(int i=1; i<=13; i++)
		{
			ThirdNumber=FirstNumber+SecondNumber;
			System.out.print (" "+ThirdNumber);
			FirstNumber=SecondNumber;
			SecondNumber=ThirdNumber;
		}
	}
}
public class MethodTest4FibonacciSeries{
	public static void main (String [] args){
		Method4 obj=new Method4();
		obj.fibonaciForFirst15Numbers();
	}
}