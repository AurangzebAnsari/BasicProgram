package ClassAndObject;

public class ExampleOfRectanglewithclassandobject {
	//it is instance variable
	int lenght,width;
	
	void  insertValue(int l,int w)
	{
		lenght=l;
		width=w;
	}
	
	void displaay()
	{
		System.out.println("Rectangle="+lenght*width);
	}
	public static void main(String args[])
	{
		ExampleOfRectanglewithclassandobject rec=new ExampleOfRectanglewithclassandobject();
		rec.insertValue(12,20);
		rec.displaay();
		
		rec.insertValue(20, 45);
        rec.displaay();	
	}
	

}
