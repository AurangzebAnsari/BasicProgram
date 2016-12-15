package thiskeyword.thismethod;

public class thismethod {
	
	int id,age,rollno;
	String name,college;
	
	public thismethod(String name,String college) {
		
		this.name=name;
		this.college=college;
	}
	
	public thismethod(String name,String college,int id,int age,int rollno) {
		this(name,college);
		this.id=id;
		this.age=age;
		this.rollno=rollno;
	}
	
	void display()
	{
		System.out.println("Name "+name+"\nRoll Number "+rollno+"\nID "+id+"\nAge "+age+"\nCollege Name"+college);
	}

}
