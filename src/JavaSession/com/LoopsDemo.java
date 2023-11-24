package JavaSession.com;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1-10
		
				
				//1-100
				/*
				 * syntax
				 * 
				 * while(condition)
				 * {
				 * 		body/statements
				 * 
				 * }
				 *minimum number of times while will execute -->0
				 * 
				 * 
				 * 
				 * 
				 */
				System.out.println("Number from 1 to 10");
				int i=1;
				while(i<=10)
				{
					System.out.println(i);//123456789---last num
					i++;//-->i+1
				}
				
				System.out.println("Even number");
				
				int ii=2;
				while(ii<=10)
				{
					System.out.println(ii);//123456789---last num
					ii=ii+2;//-->i+1
				}
				
				System.out.println("odd number");
				
				int iii=1;
				while(iii<=10)
				{
					System.out.println(iii);//123456789---last num
					iii=iii+2;//-->i+1
				}
				
				
				
				
			
				//infinite while
				
				int a=1;
				while(true)
				{
					System.out.println("Welcome to Bangalore");
					if(a==5)
					{
						break;
					}
					a++;
					
				}
				
				
				
			System.out.println("****************do while Loop*********************");
			
			/*
			 * syntax--do while
			 * 
			 * 
			 * do
			 * {
			 * 			body/statements
			 * 
			 * }
			 * while(condition);
			 * 
			 * 
			 * minimum number of times while will execute -->1
			 * 
			 * 
			 * 
			 * 
			 */
				
			System.out.println("Number from 1 to 100 using do while");
			int d=1;
			do
			{
				
					System.out.println(d);//1234
					d++;//-->d+1-->2 3 4 5
				
				
			}
			while(d<=10);
			
			
			
			System.out.println("Even number using do while");
			
			int dd=2;
			do
			{
				
					System.out.println(dd);//2 4 6 8----last number
					dd=dd+2;//-->dd+2
				
			}
			while(dd<=10);
			
			
			
			
			System.out.println("odd number using do while");
			
			int ddd=1;
			do
			{
				
					System.out.println(ddd);//1 3 5 7 9---->last
					ddd=ddd+2;//-->ddd+2
				
			}
			while(ddd<=10);
			
			
				//for loop
			
			/*
			 * 
			 * for(initialize;condition;updation(increment/decrement))
			 * {
			 * 
			 * 			body/statements
			 * 
			 * }
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
				
				System.out.println("Numbers from 1 to 10 using for loop");
				for(int j=1;j<=10;j++)
				{
					
					System.out.println(j);
					
				}
				
				
				System.out.println("Even number using for loop");
				
				for(int jj=2;jj<=10;jj=jj+2)
				{
					System.out.println(jj);
					
				}
				
			
				System.out.println("odd number using for loop");
				for(int jjj=1;jjj<=10;jjj=jjj+2)
				{
					System.out.println(jjj);
					
				}
				
				
				
				
				//infinite for loop
				
				for(;;)
				{
					System.out.println("Welcome to Nucot");
					break;
					
				}
				
				
				
				System.out.println("odd number using for loop");
				int jjjj=1;
				for(;jjjj<=10;jjjj=jjjj+2)
				{
					System.out.println(jjjj);
					
				}
				
				System.out.println("Printing  characters");
				for(char c='a';c<='z';c++)
				{
					System.out.println(c);
					System.out.println((byte)c);
					
				}
				
				
				System.out.println("Printing a to z");
				for(char c='a';c<='z';c++)
				{
					System.out.println(c);
				}
				
				// while using char
				System.out.println("Alphabet from a to z");
				char c='a';
				while(c<='z')
				{
					System.out.println(c);//abcdefg---last char z
					c++;//-->c+1
				}
				
				// while loop using float
				float f=1.0f;
				while(f<=7.0f)
				{
					System.out.println(f);
					f++;//-->c+1
				}
				
			}

		}
