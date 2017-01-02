package ConstroctorWI;

public class ConstroctorwithInheritance {
	int rollno;
	ConstroctorwithInheritance(int rollno)
	{
		this.rollno=rollno;
	}

}
class details extends ConstroctorwithInheritance
{
        String gender,name;
	details(String gender,String name) {
		
		     super(12);
		     this.name=name;
		     gender=gender;
		System.out.println("Nmae  " +name +"Gender  "+gender +"Roll Number  " +rollno);
		
	}
	
}
