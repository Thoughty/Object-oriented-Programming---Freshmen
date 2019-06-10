
public class Hexagon extends Shape{

private double side;
	
	public Hexagon()
	{
		super();
		side = 0;
		
	}
	public Hexagon(String color,double side)
	{
		super(color);
		this.side = side;
		
	}
	
	public String toString()
	{
		return "Hexagon[Side="+side+super.toString()+"]";
	}
	public double getArea() {
	      double area = (3*Math.sqrt(3)*Math.pow(side, 2))/2 ;
		   return area;
		   
	   }

	   public double getArea(double side) {
		   	
		   this.side = side;
		   return this.getArea();
		   
		   }
}
