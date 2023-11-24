package ArrayDemo;

public class Arraysession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]	= new int [5];
		
		a[0]=1;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=9;
		
		
		System.out.println(a.length);
		
		int len= a.length;
		System.out.println(len);
		
		int higerIndex=len-1;
		System.out.println(higerIndex);
		
		int lowerIndex=len-1;
		System.out.println(lowerIndex);
		
		
		//Using for loop
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//System.out.println(a);
		
		
		// Using char
		char c[]= {'a','b','c'};
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		//Using float
		float f[]= {1.0f,2.0f,3.0f};
		
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		
		//Using Short
		short s[]= {3245,2345,2335,3452};
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("short value"+s[i]);
		}
		
		
		//Using long
		long l[]= {923368935,92453767,42766725};
		
		for(int i=0;i<l.length;i++)
		{
			System.out.println(l[i]);
		}
		
		//Using Boolean
		Boolean b[]= {'true','false'};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
