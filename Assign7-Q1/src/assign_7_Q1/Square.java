package assign_7_Q1;

public class Square extends Polygon{
	double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square(double side) {
		super();
		this.side = side;
		this.noOfSides = 4;
	}

	@Override
	double calcArea() {
		double area = side*side;
		return area;
	}
	
	
}
