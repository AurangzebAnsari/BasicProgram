package thiskeyword;

public class ProvingThisKeyword {
	
	void show()
	{
		System.out.println(this);
	}
	public static void main(String args[])
	{
		ProvingThisKeyword p=new ProvingThisKeyword();
		
		System.out.println(p);
		p.show();
	}

}
