public class ProgramOfthiskeyword {
	
	void show(ProgramOfthiskeyword obj)
	{
		System.out.println("Program is run");
	}
	
	void display()
	{
		show(this);
	}
	
	public static void main(String args[])
	{
		ProgramOfthiskeyword p=new ProgramOfthiskeyword();
		p.display();
	}

}
