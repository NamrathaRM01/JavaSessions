package ClassDemo;

// Having return type and no argument
public class MethodDemo2 
{
	int add()
	{
		int a=80;
		int b=20;
		int c=a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		MethodDemo2 obj=new MethodDemo2();
		obj.add();
		int sum=obj.add();
		System.out.println(sum);
	}

}
