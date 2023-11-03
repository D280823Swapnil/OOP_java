package assign_7_Q1;

public class Rectangle extends Polygon{
			
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Rectangle(double length, double breadth) {
		super();
		this.x = length;
		this.y = breadth;
		this.noOfSides = 4;
	}

	@Override
	double calcArea() {
		double area = x*y;
		return area;
	}

}
