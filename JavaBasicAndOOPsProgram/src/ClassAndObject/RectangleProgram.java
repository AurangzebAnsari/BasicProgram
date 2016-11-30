package ClassAndObject;

public class RectangleProgram {
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
			RectangleProgram r1=new RectangleProgram(),r2=new RectangleProgram(),r3=new RectangleProgram();
			r1.insertValue(12,20);
			r1.displaay();
			
			r2.insertValue(20, 45);
	        r2.displaay();
	        
	        r3.insertValue(25, 35);
	        r3.displaay();
		}

}
