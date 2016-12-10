package thiskeyword.thismethod.defaultthis;

public class ArgumentInTheConstructorCall {
	int a=10;
	public ArgumentInTheConstructorCall() {
		
		ArgumentInTheConstructorCall0 a1=new ArgumentInTheConstructorCall0(this);
		 a1.display();
		
	}
	public static void main(String args[])
	{
		ArgumentInTheConstructorCall ar=new ArgumentInTheConstructorCall();
	}

}
