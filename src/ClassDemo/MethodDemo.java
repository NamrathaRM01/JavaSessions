package ClassDemo;

//data_type method_name()-----> No return type and no arguments 
public class MethodDemo 
{
	void add()
	{
		int a=20;
		int b=50;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	
	{
		MethodDemo obj=new MethodDemo();
		obj.add();
	}

}
