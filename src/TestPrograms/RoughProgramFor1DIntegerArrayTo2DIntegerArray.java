package TestPrograms;
class IntArray
{
	void oneDIntArrayTo2DIntArray(double arr[])
	{
		int j=0;
		//int p=0;
		//int m=0;
		double x[][]=new double [(arr.length/2)][(arr.length/2)];
		//for(int i=0; i<=arr.length/2-0.5; i++)
		for(int i=0; i<arr.length/2-0.5; i++)
		{
			int k=0;
			for(int p=0; p<arr.length/2-0.5; p++)
			{
				x[i][k]=arr[p];
				if(k<=2)
				{
					k++;
				}
			}
		}
		//for(int k=arr.length/2+0.5; k<=arr.length-1; k++)
		//{
		//	x[j][m]=arr[k];
		//	m++;
		//}
		for(int l=0; l<x.length; l++)
		{
			for(int n=0; n<x[0].length; n++)
			{
				System.out.print(x[l][n]+" ");
			}
		}
		System.out.println();
	}
}
public class RoughProgramFor1DIntegerArrayTo2DIntegerArray{
	public static void main(String[] args){
		IntArray obj=new IntArray();
		double arr[]={1,2,3,4,5,6};
		obj.oneDIntArrayTo2DIntArray(arr);
	}
}