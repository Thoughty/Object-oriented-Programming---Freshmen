
public class Circle extends Shape{
private double Radius;
	
	public Circle()
	{
		super();
		Radius = 0;
		
	}
	public Circle(String color,double Radius)
	{
		super(color);
		this.Radius = Radius;
		
	}
	
	public String toString()
	{
		return "Circle[Radius="+Radius+super.toString()+"]";
	}
	public double getArea() {
	      double PI = 3.14;
	    double  area = PI*Math.pow(Radius, 2);
		   return  area;
		   
	   }

	   public double getArea(double Radius) {
		   	
		   this.Radius=Radius;
		   return this.getArea();
		   
		   }
}
