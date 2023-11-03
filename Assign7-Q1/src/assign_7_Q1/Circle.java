package assign_7_Q1;

public class Circle extends BoundedShape{
	double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double calcArea() {
		double area = Math.PI*radius*radius;		
		return area;
	}
	

}
