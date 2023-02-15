package TestPrograms;
class ConstructorTest4
{
	ConstructorTest4(int x)
	{
		for (int i=x; i>=1; i--)
		{
			int j=i*i;
			System.out.println (j);	
		}
	}		
}
public class ConstructorTest4AnswerSquareOfEachNumber{
	public static void main (String [] args){
		ConstructorTest4 obj=new ConstructorTest4(10);
	}
}