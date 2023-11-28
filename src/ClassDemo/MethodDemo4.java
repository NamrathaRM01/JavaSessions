package ClassDemo;

public class MethodDemo4 
{
	int add(int a, int b)
	{
		int c=a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		MethodDemo4 obj=new MethodDemo4();
		int sum=obj.add(70,10);
		System.out.println(sum);
	}

}
