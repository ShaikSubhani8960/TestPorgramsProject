package TestPrograms;
class ArrayDemo
{
	void commonCode(int arr[])
	{
		int m=0; 
		int arr1[][]=new int[2][arr.length/2];
		for(int i=0; i<=arr1.length-1; i++)
		{
			for(int j=0; j<=arr1[0].length-1; j++)
			{
				arr1[i][j]=arr[m];
				m++;
			}
		}
		for(int k=0; k<=arr1.length-1; k++)
		{
			for(int p=0; p<=arr1[0].length-1; p++)
			{
				System.out.print(arr1[k][p]+ " ");
			}
			System.out.println();
		}
	}
	void oneDIntArrayTo2DIntArray(int arr[])
	{
		if(arr.length%2!=0)
		{
			System.out.println ("Given Integer Array has Odd Number of Elements so Eliminating the last Element from the Given Array, Just For Your Info PAL :)");
			this.commonCode(arr);
		}
		else 
		{
			this.commonCode(arr);
		}
	}
}
public class MethodTest3OneDArrayto2DArrayConversion{
	public static void main(String[] args){
		int arr[]={10,20,30,40,50,60,70,80,90};
		ArrayDemo obj=new ArrayDemo();
		obj.oneDIntArrayTo2DIntArray(arr);
	}
}

