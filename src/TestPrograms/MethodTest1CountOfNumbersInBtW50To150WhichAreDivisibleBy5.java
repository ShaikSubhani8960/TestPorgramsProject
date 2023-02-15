package TestPrograms;
class Method1
{
	void test1Answer(int x, int y)
	{
		int count=0;
		for (int i=x; i<=y; i++)
		{
			if(i%5==0)
			{
				count=count+1;
			}
		}
		System.out.println("Count Of Number In Between 50 To 150 Which Are Divisible by 5 is : " +count);
	}
}
public class MethodTest1CountOfNumbersInBtW50To150WhichAreDivisibleBy5{
	public static void main (String [] args){
		Method1 obj=new Method1();
		obj.test1Answer(50,150);
	}
}