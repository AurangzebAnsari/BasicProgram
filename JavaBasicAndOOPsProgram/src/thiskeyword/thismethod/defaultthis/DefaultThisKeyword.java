package thiskeyword.thismethod.defaultthis;

public class DefaultThisKeyword {
	int rollno;
	String name;
	void show()
	{
		System.out.println("STUDENT INFORMATION");
	}
	void Details(int rollno,String name)
	{
		this.show();
		this.rollno=rollno;
		this.name=name;
	}
	
	void display()
	{
		Details(rollno, name);//this keyword will be add at compile time
		System.out.println("Name "+name+"\nRoll Number"+rollno);
	}

}
