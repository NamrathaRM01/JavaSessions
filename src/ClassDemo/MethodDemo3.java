package ClassDemo;

//No return type and with arguments
public class MethodDemo3 
{
	void add1(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		MethodDemo3 obj=new MethodDemo3();
		obj.add1(30,20);
		
	}

}
