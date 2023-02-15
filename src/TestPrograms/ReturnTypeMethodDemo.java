package TestPrograms;
public class ReturnTypeMethodDemo {

	void addition(int x, int y)
	{
		int res=x+y;
		System.out.println("My name is subhani");
		System.out.println(res);
	}

	int substraction(int x, int y)
	{
		int res=x-y;
		System.out.println("My name is subhani");
		System.out.println(res);
		return 50;
	}
		
	public static void main(String[] args) {
		ReturnTypeMethodDemo obj=new ReturnTypeMethodDemo();
//		obj.addition(10, 20);
//		obj.substraction(50, 30);
		System.out.println(obj.substraction(100, 30)+50);
		int z=obj.substraction(200, 30);
		System.out.println(z);
		obj.addition(obj.substraction(100, 20), 2);
		
	}
}
