package TestPrograms;

class Method2
{
	void test2Answer(int x[], int y[])
	{
		int z[]=new int[x.length];
		for (int i=0; i<=x.length-1; i++)
		{
			z[i]=x[i]+y[i];
		}
		for(int j=0; j<=z.length-1; j++) 
		{
			System.out.print(z[j]+" ");
		}
	}
}
public class MethodTest2AdditionOf2OneDIntegerArrays{
	public static void main (String [] args){
		int arr1[]={10,20,30,40};
		int arr2[]={50,60,70,1};
		Method2 obj=new Method2();
		obj.test2Answer(arr1, arr2);
	}
}	