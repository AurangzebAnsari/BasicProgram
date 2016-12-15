package thiskeyword;


public class ExampleOfThisKeyword {
	
	int id,age,rollno;
	String name,college;
	
	public ExampleOfThisKeyword(String name,String collage) {
		
		this.name=name;
		this.college=collage;
		
	}
	
	public void details(int id,int age,int rollno) {
		
		this.id=id;
		this.age=age;
		this.rollno=rollno;	
	}
	
	void display()
	{
		System.out.println("Name "+name+"\nCollege Name "+college);
		System.out.println("age "+age+"\nRoll Number "+rollno+"\nID "+id);
	}

}
