package thiskeyword.thismethod;

public class SecondProgram {
	
	int rollno;
	String name;
	
	SecondProgram()
	{
		System.out.println("STUDENT INFORMATION");
	}
	
	SecondProgram(int id,String name)
	{
		id=id;
		name=name;
		this();
	}
	void display()
	{
		System.out.println("Name "+name+"Roll No "+rollno);
	}

}
