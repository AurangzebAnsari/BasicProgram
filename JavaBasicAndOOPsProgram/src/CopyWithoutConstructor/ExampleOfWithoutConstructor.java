package CopyWithoutConstructor;

public class ExampleOfWithoutConstructor {
	int id;
	String name;
	 ExampleOfWithoutConstructor(int i,String n) {
		id=i;
		name=n;
	}
	 public ExampleOfWithoutConstructor() {
		// TODO Auto-generated constructor stub
	}
	 void display()
	 {
		System.out.println("Studen's Id  "+id+"\nStudent's Name  "+name);
	 }
	

}
