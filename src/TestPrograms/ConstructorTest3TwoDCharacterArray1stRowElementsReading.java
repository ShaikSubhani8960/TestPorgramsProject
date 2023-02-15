package TestPrograms;
class ConstructorTest3
{
	ConstructorTest3(char arr[][])
	{		
		for(int i=0; i<=0; i++)
		{
			for(int j=0; j<=arr[0].length-1; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
	}
}
public class ConstructorTest3TwoDCharacterArray1stRowElementsReading{
	public static void main (String [] args){
		char arr[][]={{'a','b','c'},{'d','e','f'}};
		ConstructorTest3 obj=new ConstructorTest3(arr);
	}
}