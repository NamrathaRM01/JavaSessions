package JavaSession.com;

public class Nonprimitivedatatype {

	public static void main(String[] args) {
	
		int a=5;
		int b=6;
		String s="PM";
		String ss="Modi";
		System.out.println(a+b);
		System.out.println(s+ss);
		System.out.println(5/6);
		System.out.println(5-6);
		System.out.println(5.0/2.0);
		System.out.println(6.0/5.0);
		System.out.println(0/10);
		//System.out.println(10/0);
		//System.out.println(0/0);
		System.out.println("Thanks");
		System.out.println(6.0/0); //Infinity
		System.out.println(10/0.0); //Infinity
		System.out.println(10.0/10.0); //1.0
		System.out.println(0.0/0.0); //Nan
		System.out.println(a+b+s+ss);
		System.out.println(s+ss+a+b);
		System.out.println(s+ss+(a+b));
		System.out.println(a+b+s+ss+a+b);
		System.out.println(a+b+s+ss+(a+b));
		System.out.println(s+ss+a+b+s+ss+a+b);
		System.out.println(a+b+s+ss+a+b+s+ss);
		
		
		//float
		
		float f=1.0f;
		float ff=22.000f;
		
		System.out.println(f+ff+s+ss);
		System.out.println(s+ss+f+ff);
		System.out.println(s+ss+(f+ff));
		System.out.println(f+ff+s+ss+f+ff);
		System.out.println(f+ff+s+ss+(f+ff));
		System.out.println(s+ss+f+ff+s+ss+f+ff);
		System.out.println(f+ff+s+ss+f+ff+s+ss);
		
		
		//char
		
		char c1='a';
		char c2='b';
		System.out.println(c1+c2+s+ss);
		System.out.println(s+ss+c1+c2);
		System.out.println(s+ss+(c1+c2));
		System.out.println(c1+c2+s+ss+c1+c2);
		System.out.println(c1+c2+s+ss+(c1+c2));
		System.out.println(s+ss+c1+c2+s+ss+c1+c2);
		System.out.println(c1+c2+s+ss+c1+c2+s+ss);
		System.out.println(f+ff+s+ss+c1+c2);
		System.out.println(f+ff+s+ss+(f+ff)+c1+c2);
		System.out.println('z'/3);
		System.out.println(6%3); 
	}

}
