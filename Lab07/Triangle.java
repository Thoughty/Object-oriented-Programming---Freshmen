

/*  The structure of Triangle class is similar to Rectangle */
public class Triangle extends Shape {

	private double base,height;
	
	public Triangle()
	{
		super();
		base = 0;
		height = 0;
	}
	public Triangle(String color,double base,double height)
	{
		super(color);
		this.base = base;
		this.height =  height;
	}
	
	public String toString()
	{
		return "Triangle[Base="+base+", Height="+height+super.toString()+"]";
	}
	public double getArea() {
	      double area;
	      area = 0.5*base*height;
		   return area; 
		   
	   }

	   public double getArea(double base, double height) {
		   	
		   this.base =base;
		   this.height = height;
		   return this.getArea();
		   
		   
		   }

}
