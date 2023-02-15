package TestPrograms;
class Method5
{
	void test5Answer(int x[])
	{
		int k=x.length-1;
		int y[]=new int[x.length];
		for (int i=0; i<=x.length-1; i++)
		{
			y[k]=x[i];
			k--;
		}
		for(int j=0; j<=y.length-1; j++)
		{
			System.out.print(y[j]+" ");
		}
			System.out.println ();
		for(int l=y.length-1; l>=0; l--)
		{
		System.out.print(y[l]+" ");
		}
	}
}
public class MethodTest5OneDArrayTo1DArrayAndReadingInReverseOrder1{
	public static void main (String [] args){
	int arr[]={10,20,30,40};
	Method5 obj=new Method5();
	obj.test5Answer(arr);
	}
}	