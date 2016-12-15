package ConstructorProgram;

public class ExampleofDefaultConstructor {
	
	 ExampleofDefaultConstructor() {
		int a,m=0;
				int number=30,n;
				for(int i=2;i<=number/2;i++)
				{
					System.out.println(i);
					
					if(number%i==0)
					{
						System.out.println("it is not prime number  "+number);
						m=1;
						System.out.println();
						break;
					}
				}
				if(m==0)
				{
					System.out.println("it is a prime Number  " +number);
				}
	}
}	